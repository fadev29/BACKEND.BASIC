package day1.DataCollections.List;

import java.util.ArrayList;


/*
* ARRAY List : implementasi dari interfase list yang fungsinya buat nyimpen
* */
public class ArrayListExample {
    public static void main(String[] args) {
        int[] arrayBiasa = new int[5];
        arrayBiasa[0] = 10;
        arrayBiasa[1] = 20;


        // array List
        ArrayList<String> daftarNama = new ArrayList<>();

        // cara nambahin data/elemen ke dalam array list
        daftarNama.add("fachri");
        daftarNama.add("fauzi");
        daftarNama.add("fauziah");

        // cara nambahin elemen di index tertentu
        daftarNama.add(3,"kamilah");

        // cara  akses elemen di index tertentu
        System.out.println("data : " + daftarNama.get(3));

        // ngubah elemen
        daftarNama.set(3,"dina");

        //ngehapus elemen
        daftarNama.remove(2);

        // ngitung jumlah elemen
        System.out.println("jumlah data : " +daftarNama.size());

        //ngecek apakah arrayList kosong
        System.out.println("apakah array list kosong : " + daftarNama.isEmpty());

        //ngecek apakah elemen tertentu ada di dalam arrayList
        System.out.println("Nama Fachri : " + daftarNama.contains("fachri"));

        // ngambil index elemn tertentu
        System.out.println("index fachri :" + daftarNama.indexOf("fachri"));

        // ngambil index elemen terakhir
        System.out.println("index terakhir : " + daftarNama.lastIndexOf("fauziah"));

        // ngambil elemen pertama
        System.out.println("elemen pertama : " + daftarNama.get(0));

        // nampilin elemen dalam list
        System.out.println(" daftar nama : " + daftarNama);

        //nampilin semua data peke looping
        for(String nama : daftarNama){
            System.out.println(nama);
        }

        // buat arrayList dengan tipe data yang berbeda
        ArrayList dataRandom = new ArrayList<>();
        dataRandom.add("danu");
        dataRandom.add(2);
        dataRandom.add(true);
        dataRandom.add(3.5);
        // nampilin data colletion di terminal
        System.out.println(dataRandom);
        // buat nampilin setiap data yang ada di dalam data collection
        for (Object data : dataRandom) {
            System.out.println(data);
        }
    }
}
