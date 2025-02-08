package day3.FileHandling;
import  java.io.*;
public class WriteFile {
    public static void main(String[] args) {
        String fileName = "/Users/fachridjohar/BACKEND/basic_java/src/day3/FileHandling/kamu.txt";;

        File file = new File(fileName);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // buat nuli string di dalam file
            writer.write("saya telah menyesal meninggalkan mu");
            writer.newLine();
            writer.write("saya selalu memikirkan mu");
            writer.newLine();
            writer.write("wahai yang ada di sana");



            System.out.println("====================================");
            // file.getAbsolutePath : buat ngambil
            System.out.println("File berhasil dibuat\n path :   " + file.getAbsolutePath());
            System.out.println("====================================");

        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
}
