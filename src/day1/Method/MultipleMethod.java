package day1.Method;

public class MultipleMethod {
    // Method eksternal/ instance : method yang dimiliki sebuah object/class
    public static  int multiple(int num1, int num2){return num1 * num2;}

    // Method overlod

    public static  int multiple(int num1, int num2, int num3 ){return num1 * num2 * num3;}
    public static  double multiple(double num1, double num2, double num3 ){return num1 * num2 * num3;}
}
