package day2.Downcasting;
// SuperClass/parent class
public class User {
    void login(){
        System.out.println("login success!");
    }
}
// subclass
class Admin extends User{
    // void : method yang ga punya retrun
    void adminStatus(){
        System.out.println("Hi, admin");
    }
}
class  Guest extends  User{
    void guestStatus(){
        System.out.println("Hi, Guest");
    }
}