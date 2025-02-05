package day1.MathMethod;

public class MathMethod {
    public static void main(String[] args) {
        float phi = (float) Math.PI;
        System.out.println("Math.PI : " + phi);

        double floorValue = Math.floor(3.8); // bulat kebawah
        System.out.println("Math floor : " + floorValue);

        double ceilValue = Math.ceil(3.2); // bulat keatas
        System.out.println("Math ceil : " + ceilValue);

        double roundValue = Math.round(3.8); // bulat terdekat
        System.out.println("Math round : " + roundValue);

        double randomValue = Math.random(); // generate random
        System.out.println("Math random : " + randomValue);

        double squreValue = Math.sqrt(64); //ngitung akar
        System.out.println("Math sqrt : " + squreValue);

        double powerValue = Math.pow(4,2); // ngitung pangkat
        System.out.println("Math pow : " + powerValue);

        int min = Math.min(10,5); // ngitung min
        System.out.println("Math min : " + min);

        int max = Math.max(10,5); // ngitung max
        System.out.println("Math max : " + max);
    }
}
