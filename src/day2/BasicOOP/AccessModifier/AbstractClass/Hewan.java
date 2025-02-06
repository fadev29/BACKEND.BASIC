package day2.BasicOOP.AccessModifier.AbstractClass;

/* ABSTRACT CLASS : class gabisa di buat instace creation secara langsung
atau gabisa dibuat object secara langsung, cuma bisa di pakai buat class, subclass dan turunannya
*
* */
public abstract class Hewan {
    public String nama;
    public int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    /* Abstract method : method yang harus di implementansikan oleh class turunannya
    kalau gak di implementasikan maka class turunannya juga bakal abstract
    dan ga bisa buat object secara langsung
    *
    * */
    public abstract void makan();

    // method biasa ;

    public void tidur() {
        System.out.println(nama + "lagi turu!");
    }
    // getter setter(geter buat ngambil data, setter buat ngubah data)
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
