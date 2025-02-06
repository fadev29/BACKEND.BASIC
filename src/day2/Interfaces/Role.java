package day2.Interfaces;

public interface Role {
    default void  admin(Boolean isadmin){
        System.out.println("isadmin : " + isadmin);
    }
}
