package day3.Enums;
/*
* ENUM :  bisa juga kayak class punya variabel constructro sma method seperti class
* \fungsi biar enum lebih fleksibel
* */
public enum EnumLikeClass {
    SUNDAY("Weekend"), MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"), THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekday");

    private  String type;

    EnumLikeClass(String type){this.type = type;}

    public  String getType(){return type;}

}
