package day1.DataCollections.Map;

import java.util.HashMap;
/* hashMap : implementasi dari interface Map , buat nyimpan data object dalam bentuk key-value
*  HashMap kaya representasi data object kalo di js
* */
public class HashMapExample {
    public static void main(String[] args) {
        //HashMap
        HashMap<String, String> daftarNama = new HashMap<>();

        // nambahin data ke hashMap
        daftarNama.put("nama", "fachri");
        daftarNama.put("umur", "18");
        daftarNama.put("job", "Trainer");

        // cara akses data di dalam hashMap
        System.out.println("Nama :" + daftarNama.get("nama"));
        System.out.println("Umur :" + daftarNama.get("umur"));
        System.out.println("Job :" + daftarNama.get("job"));

        // ngecek ukuran data
        System.out.println("Jumlah Data : " + daftarNama.size());

        // ngecek hashMap kosong
        System.out.println("Hashmap kosong : " + daftarNama.isEmpty());

        //nampilin semua key di dalam HashMap
        for ( String Key : daftarNama.keySet()){
            System.out.println("Key :" + Key);
        }
        // nampilin semua isi data dalam key hashMap
        for(String value : daftarNama.values()){
            System.out.println("Data :  " + value);
        }
        // nampilin semua key dan data di hashMap pake entrySet
        for (String key : daftarNama.keySet()) {
            System.out.println(key + " : " + daftarNama.get(key));
        }
       // cara ngubah data dihashMap
        daftarNama.put("nama", "Dian");

        //cara ngapus data berdasarkan key
        daftarNama.remove("umur");


    }
}
