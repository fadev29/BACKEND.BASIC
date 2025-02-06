package day2.Interfaces;
/*interfaces : kumpulan method yang harus dipakai oleh class yang mengimplementasikannya*/
public interface User {
    // method wajib dipakai oleh class yang mengimpelementasikan
    String getUsername();
    String getPassword();

    void addUser(String username, String password);
    int getAllUser();

    // default method = method ini ga perlu di override(opsional)
    default void getCompany(){
        System.out.println("company : PT Aigen Global Teknologi");
    }
    // static method = method yang bisa dipanggil langsung tampa memerlukan cllas(method ini gabisa dioverride)
    static void setName(String name){
        System.out.println("nama" + name);
    }
}
