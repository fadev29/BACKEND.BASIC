package day2.BasicOOP.AccessModifier;
import day2.BasicOOP.AccessModifier.Person;
public class Main {
    public static void main(String[] args) {
        // pangill class di dalam object baru
        Person person1 = new Person("Anisa",18,"jakarta");
        Person person2 = new Person("Nabila",18,"bekasi");
        Person person3 = new Person("Kamilah",18,"semarang");


        // pangil method di dalam object
        person1.display();
        person2.display();
        person3.display();

        // pangil method static
        Person.displayTotalPerson();

        // akses datanya :
        System.out.println("public acces : "+person1.name);
//        System.out.println("private acces : "+person1.age); // eror karna accessnya private
        System.out.println("protected access : "+person1.address);
        System.out.println("final access : "+person1.Nationality);

        // kapan harus implementasi access modifier :
        /*public : biasa dipake untuk class atau method2 yg biasanya dipangil dimana saja
        * private: biasa nya dipake untuk mendeklarasikan variabel claas dimana gabisa sembarang diubah
        * final : ketika kita mau defisinikan nilai default yang konstant untuk suatu variabel
        * */

    }
}
