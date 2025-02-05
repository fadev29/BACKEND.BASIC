package day1.Casting;

public class Main {
    public static void main(String[] args) {
        int number =  123;

//        konversi int ke string :
        String intToString = Integer.toString(number);
        System.out.println("number : " + intToString );

        // konversi string ke int
        String numberString = "123";
        System.out.println("string to int :" + Integer.parseInt(numberString));

        // String to Double
        String doubleString = "123.456";
        System.out.println("string to double :" + Double.parseDouble(doubleString));
        // String to boolean

        String booleanString = "true";
        System.out.println("String to Boolean : " + Boolean.parseBoolean(booleanString));

        // int to double
        int intValue = 12;
        double doubleValue = intValue;
        System.out.println("int to double : " + doubleValue );

        // double to int
        int intValueFromDouble = (int) doubleValue;
        System.out.println("double to int  : " + intValueFromDouble);

    }
}
