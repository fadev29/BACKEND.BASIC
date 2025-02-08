import java.util.concurrent.TimeUnit;

public class BerjalanDiJava {
    public static void main(String[] args) throws InterruptedException {
        String[] lirik = {
                "Aku mulai dengan public class Main,",
                "Menulis kode, tak ingin error datang.",
                "System.out.println(\"Halo dunia!\");",
                "Mari kita mulai petualangan nyata.",

                "Berjalan di Java, kode mengalir,",
                "Compile sukses, hati pun berseri.",
                "Tak ada NullPointer, semua terkendali,",
                "Dengan Scanner ku input mimpi!",

                "Coba while, coba for, looping tak henti,",
                "Jangan lupa break, kalau ingin berhenti.",
                "Pakai try-catch, biar aman selalu,",
                "Tak perlu panik kalau exception mengganggu.",

                "Kelas dan objek, kita instantiate,",
                "Di dalam heap, semua tersimpan rapi.",
                "Garis demi garis, ku debug perlahan,",
                "Akhirnya program berjalan sempurna!",

                "Saat program selesai, ku commit ke repo,",
                "Push ke GitHub, biar orang tahu.",
                "Di dunia Java, ku tetap berkarya,",
                "return 0;, sampai jumpa!"
        };

        // Menampilkan lirik satu per satu dengan efek delay
        for (String baris : lirik) {
            System.out.println(baris);
            TimeUnit.MILLISECONDS.sleep(1200); // Delay 1.2 detik untuk efek berjalan
        }
    }
}
