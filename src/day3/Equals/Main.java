package day3.Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> Listuser = new ArrayList<>();

    public void registerUser(User user){Listuser.add(user);}

    public  void isUserRegistered(User user){
        if(Listuser.contains(user)){
            System.out.println(user.getUsername() + "is registered");
        }else {
            System.out.println(user.getUsername() + "is not registered");
        }
    }

    public static void main(String[] args) {
        Main userController = new Main(); // intance dari object Main

        // register user baru
        User user1 = new User("fachri","fachridjohar71@gmail.com");
        User user2 = new User("fadev","fachrigabutt@gmail.com");
        userController.registerUser(user1);
        userController.registerUser(user2);


        // simulasi user tidak terdaftar
        User userNotRegistered = new User("kamilah","kamilah@gmail.com");
        userController.isUserRegistered(userNotRegistered);
    }
}
