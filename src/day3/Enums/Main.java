package day3.Enums;

public class Main {
    public static void main(String[] args) {
        //pangi enum nya
        EnumDay today = EnumDay.FRIDAY;

        switch (today){
            case SUNDAY :
                System.out.println("today is sunday");
                break;
            case MONDAY:
                System.out.println("today is monday");
                break;
            case TUESDAY:
                System.out.println("today is tuesday");
                break;
            case FRIDAY:
                System.out.println("today is friday");
                break;
            default:
                System.out.println("day is not valied");
        }

        //enum class

        EnumLikeClass getToday = EnumLikeClass.MONDAY;
        System.out.println("today is " + getToday + "and it's a " + getToday.getType());
    }
}
