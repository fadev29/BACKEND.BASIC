package day5;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;
public class costumerCRUD {
    String url = "jdbc:postgresql://localhost:5432/shopp";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData(){
        try{
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from customers");

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
        System.out.println("Masukan Alamat anda : ");
        String address = input.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customers (customers_name, address ) values(?)");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);

            preparedStatement.executeUpdate();
            System.out.println("data berhasil ditambahkan");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void editData(){
        System.out.println("Masukan id customers :  ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Masukan nama customers :  ");
        String name = input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement("update customers set customers_name = ? where id = ?");
            preparedStatement.setString(1,name);
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
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customers where id = ?");
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
