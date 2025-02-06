package day2.Interfaces;

public class Main {
    public static void main(String[] args) {
        UserController akun1 = new UserController("fachri","123");

        System.out.println("Username : " + akun1.getUsername());
        System.out.println("Password : " + akun1.getPassword());
        akun1.addUser("kamilah", "123456");
        System.out.println("total user :" + akun1.getAllUser());
        //default method
        akun1.getCompany();
        // memangil static method tampa menggunakan class
        User.setName("Dimas Tri sulaksono");
        // memanggil method

    }
}
