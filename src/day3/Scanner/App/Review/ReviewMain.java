package day3.Scanner.App.Review;

import java.util.Scanner;

public class ReviewMain {
   public static void main(){
       ReviewProduct.ReviewController reviewController = new ReviewProduct.ReviewController();
       Scanner input = new Scanner(System.in);

       System.out.println("=================== REVIEW LIST ===================");
       System.out.println("Apakah anda ingin Review (y/n)");
       String review = input.nextLine().toLowerCase();
       if(review.equals("y")){
           System.out.println("Masuka jumlah Review :  ");
           int reviewproduct = input.nextInt();
           input.nextLine();
           for (int i = 0; i < reviewproduct; i++) {
               System.out.println("Nama : ");
               String name = input.nextLine();
               System.out.println("review(1-5)");
               int review1 = input.nextInt();
               ReviewProduct reviewProduct = new ReviewProduct(name,review1);
               reviewController.addname(reviewProduct);
           }
       }
       reviewController.displayReview();
       input.close();
    }
}
