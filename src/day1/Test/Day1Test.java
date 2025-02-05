package day1.Test;

import javax.imageio.stream.ImageInputStream;

/*
 *  1. Buat logic untuk ngecek apakah sebuah bilangan adalah bilangan prima?
 *  2. Buat logic untuk nyari niali terbesar dan terkecil dari sebuah array apke math method ?
 *  3. Buat logic untuk nyari jumlah elemen yang niali nya genap dan jumlah elemen nya nilai ganjil?
 *  4. Buat logic untuk menghitung jumlah karakter dalam sebuah String?
 *  5. Buat logic untuk menghitung jumlah huruf vokal dalam string "kata"?
 *  6. Buat array yang terdiri dari 5 mahasiswa , masing-masing punya 3 nilai : ujian,absen,kuis
 *     kalkulasi nilai mereka berdasarkan rata2 nilai dari 3 nilai tersebut
 *     lalu tentukan grade mereka berdasarkan nilai rata2 menggunakan logic if-else dan ENUM
 * */

public class Day1Test {
    public static void main(String[] args) {
        // nomor 1 :
        int bilangan ;
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i <= numbers.length; i++){
            bilangan= 0;
          for(int j = 1; j <=i; j++){
              if(i % j==0){
                  bilangan = bilangan+1;
              }
          }
            if (bilangan == 2){
                System.out.println("Bilangan prima : " + i);
            }
        }

        // nomor 2 :
        int[] angka = {1,2,3,4,5,6,7,8,9,10};
        for (int i : angka){
            int angkaTerbesar = 0;
            System.out.println("Angka terbesar : " + Math.max(angkaTerbesar,i));
        }
        for(int i : angka){
            int angkaTerkecil = 0;
            System.out.println("Angaka terkecil : " + Math.min(angkaTerkecil,i));
        }

        // nomor 3 :
        for(int i = 0; i < angka.length; i++){
            if(angka[i] > 0){
                System.out.println("Angka genap : " + angka[i]);
            }else if(angka[i] < 0){
                System.out.println("Angka ganjil : " + angka[i]);
            }
        }
        // nomor 4 :
        String kata = "aku sedang belajar java";
        int jumlahKata = kata.length();
        System.out.println("Jumlah kata: " + jumlahKata);

        // nomor 5 :

       int jumlahVokal = 0;
        for (int i = 0; i < kata.length(); i++) {
            char ch = kata.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               jumlahVokal++;
           }
        }
        System.out.println("Jumlah vokal : " + jumlahVokal);
         Integer[][] mahasiswa = {
                 {10,8,9},
                 {9,8,9},
                 {9,8,9},
                 {5,8,9},
                 {7,8,9},
        };
         for(int i = 0; i < mahasiswa.length; i++){
             for(int j = 0; j < mahasiswa[i].length; j++){
              int nilaitambah = mahasiswa[i][j]  + mahasiswa[i][j];
              int nilaiRata2 = nilaitambah / 3;
                 enum Grade {
                     LULUS,
                     TIDAK_LULUS,
                     TIDAK_DIKETUHUI
                 }
                 if(nilaiRata2 > 5) {
                     System.out.println(" selamat anda : "+Grade.LULUS);
                 } else if(nilaiRata2 < 5) {
                     System.out.println(" anda : "+Grade.TIDAK_LULUS);
                 }else {
                     System.out.println(" anda : "+ Grade.TIDAK_DIKETUHUI);
                 }
             }
             System.out.println();
         }
        System.out.println();


    }
}

