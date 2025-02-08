package day3.Equals;
class Car{
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;
    }
}

/*
* EQUALS : method buat bandingin 2 object apakah merekah punya atribut dan isi yang sama
* ini sama kayak operator == di js
* */
public class BasicEquals {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai Ionic 5", 2023);
        Car car2 = new Car("Toyota supra x",2025);
        Car car3 = car1; // mereferensikan(akses alamat) object ke object yang ada

        // method equal default dari object
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        if(car1.equals(car3)){
            System.out.println("Mobil nya sama");
        }else {
            System.out.println("mobilnya beda");
        }

    }
}
