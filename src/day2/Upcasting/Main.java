package day2.Upcasting;

import day2.Upcasting.User;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user = admin;

        user.login();
    }
}
