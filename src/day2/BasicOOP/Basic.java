package day2.BasicOOP;
/* Basic OOP :
class : konsep dassar untuk bikin object atau kerangka kerja yang mendefisinikan
karakteristik dan perilaku dari object
atau bisa dibilang class yg berisi fungsionalitas suatu program
*
* */
public class Basic {
    public static class Human { // class static yang bisa dipangil oleh class lainya sebagai object

        // class attribute: data yang dimiliki object
        String name;
        int age;
        // constructor : method yang dijalankan ketika sebuah object dibuat/nilai awal
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // method : fungsi khusus yg dimiliki oleh class
        public void breath(){
            System.out.println(name + "is breathing. and he's age" + age + "years old");
        }

        public void fart(){
            System.out.println(name + "is farting");
        }
    }
}
