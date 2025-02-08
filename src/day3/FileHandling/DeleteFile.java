package day3.FileHandling;
import  java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        String filePath ="/Users/fachridjohar/BACKEND/basic_java/src/day3/FileHandling/test.txt";
        File file = new File(filePath);

        if(file.exists()){
            if(file.delete()){
                System.out.println("file berhasil di hapus");
            } else {
                System.out.println("file tidak di temukan");
            }
        }
    }
}
