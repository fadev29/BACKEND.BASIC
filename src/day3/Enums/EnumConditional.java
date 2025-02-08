package day3.Enums;

import day2.BasicOOP.AccessModifier.Person;

public class EnumConditional {
    enum userStatus{
        ACTIVE, NONACTIVE,BANNED;
    }

    static class User{
        private String nama;
        private userStatus status;

        public  User(String nama, userStatus status){
            this.nama = nama;
            this.status = status;
        }
        public void  setStatus(userStatus status){this.status = status;}
        public void checkStatus(){
            System.out.println("User " + nama + " is " + status);
        }
    }

    public static void main(String[] args) {
        userStatus user1 = userStatus.NONACTIVE;

        if(user1 == userStatus.ACTIVE){
            System.out.println("user is Active");
        }else {
            System.out.println("User is non-active");
        }

        User fachri = new User("fachri", userStatus.ACTIVE);
        System.out.println("=== check status ===");
        fachri.checkStatus();

        System.out.println("=== update status ===");
        fachri.setStatus(userStatus.BANNED);
        fachri.checkStatus();
    }
}
