package day2.BasicOOP.AccessModifier.AbstractClass;

public class Kucing extends Hewan {
    // kata kunci super buat make variabel yang di miliki parent
    public Kucing(String nama, int umur){super(nama,umur);}

    @Override
    public void makan(){
        System.out.println(nama + "lagi makan!");
    }
}
