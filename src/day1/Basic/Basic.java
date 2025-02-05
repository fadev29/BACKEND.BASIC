package day1.Basic;
/*
*  Java : bahsa programming OOP (Object Oriented Programming)
* setiap class yang dibuat didalam file java mewakili suatu object
* */

public class Basic {
//     Method main atau blok code yang akan mengeksekusi suatu program/perintah
    public static void main(String[] args) {
// variabel : wadah menyimpan data
// tipe data : menentukan jenis data yang disimpan di variabel
/*
* cara buat variabel:
* <tipe data> <nama variabel> = isi data
* */
        String name = "fachri";// string
        int age = 18;// integer

        Boolean isStudent = false; // boolean

//        system.out.println : buat nampilin data  ke output terminal
        System.out.println("nama saya" +name+ "umurku" + age + "dan status siswaku" + isStudent);

        System.out.println("=== ARRAY ===");
//        array di java punya ukuran data yang statis gabisa sembarangan ubah(tambah data nya) dan cuma bisa nyimpan 1 tipe data
        int[] numbers = {1,2,3,4,5};
        System.out.println("Array length  :" + numbers.length);
        numbers[4] = 7;
//        looping tradisional
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers" + i);
        }
//        Integer : tipe data yang bisa deimanipulasi pake method-method array
        Integer integerNumber = 25;
        System.out.println("Integer" + integerNumber);

//        object : tipe data campuran
        Object[] dataCampuran = {"fachri", 25};
// enhanced looping
        for (Object i : dataCampuran) {
            System.out.println("dataCampuran" + i);
        }
//        tipe data angka yang ukurannya lebih besar dibandingkan int
      long logNumber = 123;
        System.out.println(logNumber);

//        tipe data nilai pecahan
        double doubleNumber = 10.2;
        float floatNumber = 10;

//        concatenation : method untuk menggabungkan 2 string
        String firstName = "Fachri";
        String lastName = "Djohar";
        System.out.println("basic" + firstName + " " + lastName);
//        concat untuk tipe data string
        System.out.println("concat" + firstName.concat(lastName));

        // ENUM : buat nyimpan nilai nilai kostan yanggabisa diubah
        enum Grade {
            LULUS,
            TIDAK_LULUS
        }
        System.out.println("Status Kelulusan anda : " + Grade.LULUS);

    }
}
