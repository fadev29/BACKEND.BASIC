package day2.BasicOOP.AccessModifier.AbstractClass;

public class Main {
    public static void main(String[] args) {
        // bikin object dari turunan class hewan
        Kucing kucingOyen= new Kucing("opil", 2);

        // akess method nya :
        kucingOyen.makan();
        kucingOyen.tidur();

        // akess getter
        System.out.println("Nama Kucing :" + kucingOyen.getNama());
        System.out.println("Umur Kucing :" + kucingOyen.getUmur());
    }
}
