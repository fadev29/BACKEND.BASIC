package day5;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;
public class ProductCRUD {
    String url = "jdbc:postgresql://localhost:5432/shopp";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData(){
        try{
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from products");

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();

            ObjectMapper mapper = new ObjectMapper();

            ArrayNode arrayNode = mapper.createArrayNode();

            while (resultSet.next()){

                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i < columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName,resultSet.getString(i));
                }

                arrayNode.add(objNode);
            }

            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
            System.out.println(jsonString);

        }catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
    public void addData(){
        System.out.println("Masukan nama Product : ");
        String name = input.nextLine();
        System.out.println("Masukan harga product : ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Masukan category : (1.Electronics,2.Fashion,3.Skincare,4.Furniture)");
        int category = input.nextInt();
        input.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into products (product_name,product_price,categories_id) values(?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setDouble(2,price);
            preparedStatement.setInt(3,category);

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

        System.out.print("Masukan kategori product : (1.Electronics,2.Fashion,3.Skincare,4.Furniture) : ");
        int category = input.nextInt();
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("update products set product_name = ?,product_price = ?, categories_id = ? where id = ?");
            preparedStatement.setString(1,name);
            preparedStatement.setDouble(2,price);
            preparedStatement.setInt(3,category);
            preparedStatement.setInt(4,id);

            int rowsUpdated = preparedStatement.executeUpdate();
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
            PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
            preparedStatement.setInt(1,id);

            int productDelete = preparedStatement.executeUpdate();

            if(productDelete > 0){
                System.out.println("Data berhasil di Delete");
            }else {
                System.out.println("Data dengan id =" + id + "tidak ditemukan");
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
