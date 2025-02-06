package day2.BasicOOP.AccessModifier;

public class Person {
    // Acsess Modifier : kata kinci untuk mengatur aksebilitas,visibilitas dari sebuah class, variabel,atau method

    //public
    public String name; // bisa di akses dimana ajah

    // Private
    private int age; // cuma bisa di akses didlam class sendiri(person)

    // Protected
    protected String address; // cuma bisa di akses oleh class sendiri(person) dan subclassnya

    // Non-access modifier : buat ngasih nilai awal
    // static
    public static int totalPerson = 0; // variabel statis untuk ngasih nilai awal terhadap variabel

    //final
    public final String Nationality = "Indonesia"; // untuk biki nilai constant

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        totalPerson++;
    }

    // method nya :
    public void  display() {
        System.out.println("My name : " + name);
        System.out.println("My age : " + age);
        System.out.println("My address : " + address);
    }

    // method static untuk nampilin total object setiap kali object person ditambahkan :
    public  static void displayTotalPerson(){
        System.out.println("total person : " + totalPerson);
    }
}
