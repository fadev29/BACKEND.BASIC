package day4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

import  com.fasterxml.jackson.databind.ObjectMapper;
public class DemoCRUD {
    // connect to database(db)
    String url = "jdbc:postgresql://localhost:5432/bootcamp";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData(){
        try{
            //DriverManager.getConnectio : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url,username,password);
            // panggil object statement buat buat ngeksekusi query
            Statement statement = connection.createStatement();
            // pangil ResultSet buat nampung hasil eksekusi query
            ResultSet resultSet = statement.executeQuery("select * from all_products");

            // ambil nama kolom dan tipe data dari kolom
            ResultSetMetaData metaData = resultSet.getMetaData();
            //ambil jumlah kolom
            int columnCount = metaData.getColumnCount();
            // ObjectMapper mapping data ke format JSON
            ObjectMapper mapper = new ObjectMapper();// bikin object kosong
            // arrayNode buat nampung data ke array of object(JSON)
            ArrayNode arrayNode = mapper.createArrayNode();// bikin array kosong

            while (resultSet.next()){
                // buat data object untuk setiap baris data
                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i < columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName,resultSet.getString(i));
                }
                // masukin data object yang udah dilooping kearray
                arrayNode.add(objNode);
            }
            // buat format data ke format JSON yang lebih rapih
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
            System.out.println(jsonString);

        }catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }

    public  void  addData(){
        System.out.print("Masukan nama Product :  ");
        String name = input.nextLine();

        System.out.print("Masukan harga product : ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("Masukan kategori product : ");
        String category = input.nextLine();

        try {

            Connection connection = DriverManager.getConnection(url,username,password);
            // PreparedStatement : untuk ngeksekusi query yang jumlah data nya banyak . (?,?,?) pada values buat cegah SQL inejection
            PreparedStatement preparedStatement = connection.prepareStatement("insert into all_products (product_name, product_price, category) values(?,?,?)");
            preparedStatement.setString(1,name); // setString buat masukin dat string
            preparedStatement.setDouble(2,price);// double
            preparedStatement.setString(3,category);

            preparedStatement.executeUpdate();
            System.out.println("data berhasil ditambahkan");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void editData(){
        System.out.println("Masukan id product :  ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukan nama Product :  ");
        String name = input.nextLine();

        System.out.print("Masukan harga product : ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.print("Masukan kategori product : ");
        String category = input.nextLine();
        try {

            Connection connection = DriverManager.getConnection(url,username,password);
            // PreparedStatement : untuk ngeksekusi query yang jumlah data nya banyak . (?,?,?) pada values buat cegah SQL inejection
            PreparedStatement preparedStatement = connection.prepareStatement("update all_products set product_name = ?,product_price = ?, category = ? where id = ?");
            preparedStatement.setString(1,name); // setString buat masukin dat string
            preparedStatement.setDouble(2,price);// double
            preparedStatement.setString(3,category);
            preparedStatement.setInt(4,id);
            // eksekusi query
            int rowsUpdated = preparedStatement.executeUpdate();
            // kondisi untuk ngecek apa ada data di update
            if(rowsUpdated > 0){
                System.out.println("Data berhasil di Update");
            }else {
                System.out.println("Data dengan id =" + id + "tidak ditemukan");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void deleteData(){
        System.out.println("Masukan id product :  ");
        int id = input.nextInt();
        input.nextLine();


        try {

            Connection connection = DriverManager.getConnection(url,username,password);
            // PreparedStatement : untuk ngeksekusi query yang jumlah data nya banyak . (?,?,?) pada values buat cegah SQL inejection
            PreparedStatement preparedStatement = connection.prepareStatement("delete from all_products where id = ?");
            preparedStatement.setInt(1,id);
            // eksekusi query
            int productDelete = preparedStatement.executeUpdate();
            // kondisi untuk ngecek apa ada data di update
            if(productDelete > 0){
                System.out.println("Data berhasil di Delete");
            }else {
                System.out.println("Data dengan id =" + id + "tidak ditemukan");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
    public void addOrder(){
        System.out.println("Masukan id product :  ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Masukan qty : ");
        int quantity = input.nextInt();
        input.nextLine();


        try {
            //DriverManager.getConnection digunakan untuk menghubungkan ke database
            Connection connection= DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement= connection.prepareStatement("insert into orders (product_id, order_date, quantity) values(?, ?, ?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setDate(2, Date.valueOf(LocalDate.now()));
            preparedStatement.setInt(3,quantity);
            int productOrder = preparedStatement.executeUpdate();
            if(productOrder > 0){
                System.out.println("data order di tambahkan");
            }else {
                System.out.println("data dengan id" + id + "tidak ditemukan");
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        DemoCRUD demo = new DemoCRUD();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("==== Menu ====");
            System.out.println("1. View all products");
            System.out.println("2. add new products");
            System.out.println("3. Edit products");
            System.out.println("4. delete products");
            System.out.println("5. order products");
            System.out.println("0. Exit");
            System.out.println("Pilih menu:  ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    demo.getData();
                    break;
                case 2:
                    demo.addData();
                    break;
                case 3:
                    demo.editData();
                    break;
                case 4:
                    demo.deleteData();
                    break;
                case 5:
                    demo.addOrder();
                    break;
                case 0:
                    System.out.println("Thank you, Have a good day!");
                    input.close();
                    return;// buat ngeclose menu input
                default:
                    System.out.println("input tidak valid");
            }
        }
    }

}
