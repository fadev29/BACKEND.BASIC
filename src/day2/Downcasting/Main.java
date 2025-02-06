package day2.Downcasting;
/* Downcasting : ngubah super class/parent jadi subclass/child class
* biar bisa make method/atribut yang spesifik dari subclass*/
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();// bikin object admin
        Guest guest = new Guest();
        User user = admin;// bikin object user
        User user1 = guest;
        Admin admin1 = (Admin) user;// downcasting User ke admin
        admin1.adminStatus(); // method yang ingin dipakai superclass
        admin1.login();// method yang bisa dipake superclass walaupun udah di downcast

        Guest guest1 = (Guest) user1;
        guest1.guestStatus();
    }
}
