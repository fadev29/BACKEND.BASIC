package day2.BasicOOP;
import day2.BasicOOP.Basic.Human;
public class Main {
    public static void main(String[] args) {
        // Instace creation dari class Human : proses bikin object baru dari sebuah class
        Human student = new Human("imron", 30);

        // instance method : menthod yang bisa di akses oleh object yang menampung suatu class
        student.fart();
        student.breath();

    }
}
