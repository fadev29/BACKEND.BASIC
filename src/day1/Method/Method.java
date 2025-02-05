package day1.Method;
// cara import method instance
  import static day1.Method.MultipleMethod.*;
  import static day1.Method.Animal.*;
public class Method {
    // method : fungsi untuk menjalankan suatu perintah/perilaku tertentu (fungsi)

    /* public static int add(int num1, int num2){} cara buat method
    public static : access modifier agar method ini bisa digunakan secara global
    int add(params) : method/fungsi dengan retrun integer
    retrun : buat ngembaliin nilai
    * */
    public static int add(int num1, int num2){return num1 + num2;}

    public  static int cekNilai (int nilai){
        if(nilai >= 80) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
        }
        return nilai;
    }
    public static void main(String[] args) {
        // cara jalanin method
        int result = add(5,2);
        System.out.println("sum : " + result);

        // panggil method
        cekNilai(100);
        System.out.println("======= method overload =======");
        // multiple

        System.out.println("multiple : " + multiple(10, 10));
        System.out.println("multiple souble : " + multiple(10, 10,10));

        // cara memangil instance method : jadi simpan classnya ke object baru
        System.out.println("======= instance method =======");
        System.out.println(sound());
        System.out.println(Animal.Cat.sound());
        Animal hewan = new Animal();
        System.out.println("sound : " + hewan.sound());
    }
}
