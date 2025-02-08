package day3.Scanner.App.Products;

import java.util.Optional;
import java.util.Scanner;

public class ProductMain {
    public static void main() {
        Products.ProductController productController = new Products.ProductController();

        Scanner input = new Scanner(System.in);

        System.out.println("=================== PRODUCT LIST ===================");
        productController.displayAllProducts();
        System.out.println("====================================================");

        System.out.println("Apakah anda ingin menambahkan product baru? (Y/N) : ");
        String addProductChoice = input.nextLine().toLowerCase();

        if(addProductChoice.equals("y")){
            System.out.println("Masuka jumlah Product :  ");
            int jumlahProduct = input.nextInt();
            input.nextLine();

            for (int i = 0; i < jumlahProduct; i++) {
                System.out.println("data data product ke-" +(i + 1));
                System.out.println("Nama : ");
                String nama = input.nextLine();
                System.out.println("Harga: ");
                double harga = input.nextDouble();
                input.nextLine();
                System.out.println("Kategori : ");
                String kategori = input.nextLine();

                Products products = new Products(nama,harga,kategori);
                productController.addProduct(products);

            }
        }
        System.out.println("=================== PRODUCT LIST ===================");
        productController.displayAllProducts();
        System.out.println("====================================================");


        System.out.println("=================== SORT PRODUCT BY PRICE ===================");
        // sort method
        System.out.println("Apakah anda melihat harga sort product (y/n)");
        String sortproducts = input.nextLine().toLowerCase();
        if(sortproducts.equals("y")){
            productController.sortProduct();
        }else {
            System.out.println("tidak ada sort");
        }
        productController.displayAllProducts();
        System.out.println("====================================================");

        System.out.println("Apakah anda ingin mencari product? (Y/N)");
        // method & logic untuk nyari product berdasarkan nama
        String searchProduct = input.nextLine().toLowerCase();
        if(searchProduct.equals("y")){
            System.out.println("product apa yang elu cari ? ");
            String product = input.nextLine();
            Optional<Products> cariproduct = productController.searchName(product);
            if(cariproduct.isPresent()){
                System.out.println("product yang anda cari " + cariproduct.get());
            }else {
                System.out.println("Anda tidak ingin mencari product");
            }
        }
        System.out.println("====================================================");
        //  buat method save product ke file
        System.out.println("Apakah anda ingin save file product? (Y/N)");
        String save = input.nextLine().toLowerCase();

        if(save.equals("y")){
            productController.saveData();
            System.out.println("file berhasil di save");
        }else {
            System.out.println("anda tidak save file product");
        }

        System.out.println("====================================================");
        // buat method read file product
        System.out.println("Apakah anda ingin melihat file product? (Y/N)");
        String readdata = input.nextLine().toLowerCase();
        if(readdata.equals("y")){
            productController.lihatdata();
            System.out.println("data sudah di read !!!!!!");
        }else {
            System.out.println("anda tidak ingin melihat file product");
        }
        System.out.println("====================================================");
            input.close();
    }
}
