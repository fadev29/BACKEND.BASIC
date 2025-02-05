package day1.Logic;

public class LogicStatement {
    public static void main(String[] args) {
//        if
         int nilai = 10;
         if(nilai > 5) {
             System.out.println("nilai bagus");
         }
//         if -else
        int nilaiSiswa = 75;
         if(nilaiSiswa >= 60) {
             System.out.println("lulus");
         } else {
             System.out.println("Dropout");
         }
//         if-else-if
        if(nilaiSiswa>= 90) {
            System.out.println("nilai A");
        } else if (nilaiSiswa >= 80) {
            System.out.println("nilai B");
        } else {
            System.out.println("nilai C");
        }
//        Switch Case
        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            default:
                System.out.println("nilai tidak valid");
        }

    }
}
