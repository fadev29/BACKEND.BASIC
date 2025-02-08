package day3.Scanner.App.Review;
import day3.Scanner.App.Products.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReviewProduct {
    String name;
    int reviewer;

    public ReviewProduct(String name, int reviewer){
        this.name = name;
        this.reviewer = reviewer;
    }

    public static class ReviewController{
        private final List<ReviewProduct> reviewProductList;

        public ReviewController(){
            reviewProductList = new ArrayList<>();
        }

        public void addname(ReviewProduct reviewProduct){reviewProductList.add(reviewProduct);}

        public void displayReview(){
            if(!reviewProductList.isEmpty()){
                for (ReviewProduct reviewProduct : reviewProductList){
                    System.out.println("Review Products :   "+"  name   : " + reviewProduct.name + " review  : " + reviewProduct.reviewer);
                }
            }else {
                System.out.println("anda tidak mereview !!!");
            }
        }
    }

}
