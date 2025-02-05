package day1.DataCollections.Set;

import java.util.HashSet;

/* HashSet : implementasi dari interface set buat nyimpen data-data yang unik (tidak boleh diDublikat
dalam bentuk himpunan atau set
* */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String>himpumnanNama = new HashSet<>();

        himpumnanNama.add("danu");
        himpumnanNama.add("dani");
        himpumnanNama.add("dodi");
        himpumnanNama.add("danu"); // ini ga bakal ditambahin lagi karena udah ada

        System.out.println("Set nama : " + himpumnanNama);
    }
}
