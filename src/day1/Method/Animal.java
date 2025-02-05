package day1.Method;

public class Animal {
    public static String sound(){return "Kiw Kiw";}

    // class children yang mewarisi sifat/method2 parent
    class Cat extends Animal{
        public static String sound() {return "Miau Miau";}
    }
}
