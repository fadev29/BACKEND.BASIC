package day3.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // import Scanner dari java buat bikij inputan ke terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Nama :    ");
        String nama = scanner.nextLine();
        System.out.println("Umur : ");
        int age = scanner.nextInt();
        scanner.nextLine();// bikin karakter \n setelah membaca inputan khusus angka
        System.out.println("Kelas :  ");
        String kelas = scanner.nextLine();

        System.out.println("Hello,   " + nama  + " Umur " + age + "Kelas" + kelas);

        // buat nutup inputan
        scanner.close();
    }
}
