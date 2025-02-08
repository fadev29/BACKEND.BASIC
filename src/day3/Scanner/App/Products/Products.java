package day3.Scanner.App.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Products {
    public String name;
    public double price;
    public String category;

    public Products(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName(){return name;}
    public double getPrice(){return price;}

    //inner class
    public  static class ProductController{
        private final List<Products> productsList;

        public ProductController(){
            productsList = new ArrayList<>();
        }
        // method
        public void addProduct(Products products){productsList.add(products);}

        public void displayAllProducts(){
            if(!productsList.isEmpty()){
                for (Products products : productsList){
                    System.out.println("nama " + products.name + ", price : " + products.price + ", category : " + products.category);
                }
            }else {
                System.out.println("produk tidak tersedia");
            }
        }
        public void  sortProduct(){
            productsList.sort(Comparator.comparingDouble(Products::getPrice).reversed());
        }
       public Optional<Products> searchName(String name){
            return productsList.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
       }
       public void saveData(){
            String fileName = "/Users/fachridjohar/BACKEND/basic_java/src/day3/Scanner/App/Products/dataProduct1.txt";

           File file = new File(fileName);

           try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Products products : productsList){
                    writer.write(products.name+"," + products.price+","+products.category);
                }
           }catch (IOException e){
               throw  new RuntimeException(e);
           }
       }
       public void lihatdata(){
           String fileName = "/Users/fachridjohar/BACKEND/basic_java/src/day3/Scanner/App/Products/dataProduct1.txt";

           try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
               String line;
               while ((line = reader.readLine())!= null){
                   System.out.println(line);
               }
           }catch (IOException e){
               e.printStackTrace();
           }
       }
    }
}
