package day2.OOP.Blogs.Users;
// ini adalah child class implementasi dari inherritace
// child class Admin inherit from parent class user
public class Admin extends User {
    private boolean isAdmin;

    public Admin(String username, boolean role) {
        super(username);
        isAdmin= role;
    }
    @Override
    public void displayInfo() {
        System.out.println("Admin username : " + getUsername());
        System.out.println("Is Admin : " + isAdmin);
    }
}
