package day3.Scanner.App.Home;

import day3.Equals.Main;
import day3.Scanner.App.Products.ProductMain;
import day3.Scanner.App.Review.ReviewMain;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============  MENU  ============");

        System.out.println("- Login");
        System.out.println("- Register");
        System.out.println("- Product");
        System.out.println("- Cart");
        System.out.println("- Review");
        System.out.println("Pilih menu : ");
        // convert inputan ke huruf kapital
        Menu myMenu = Menu.valueOf(input.nextLine().toUpperCase());

        switch (myMenu){
            case LOGIN:
                System.out.println("login success!");
                break;
            case REGISTER:
                System.out.println("register success!");
                break;
            case PRODUCT:
                ProductMain.main();
                break;
            case CART:
                System.out.println("cart success!");
                break;
            case REVIEW:
                ReviewMain.main();
                // buat menu review yang bisa nambahin nama reviewer dan rating(int), kemudian tampilin semua review
                break;
            default:{
                System.out.println("tidak ada");
            }
        }
    }
}
