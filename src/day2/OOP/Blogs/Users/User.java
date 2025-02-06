package day2.OOP.Blogs.Users;
/*
* INHERITANCE:
* konsep untuk menurunkan sifat/perilaku parent class ke child class
* artiya class turunannya bisa menggunakan properti dan method milik parent
* child class(inheritance) bisa menambahkan properti dan method sendiri
* */
public class User {
    private String username;

    public User(String uname){username = uname;}

    public String getUsername() {return username;}
    public void displayInfo(){
        System.out.println("Username : " + username);
    }

}
