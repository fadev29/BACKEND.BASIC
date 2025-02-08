package day3.FileHandling;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) {
        // gunakan absolute path(path lengkap) untuk akses file
        String filePath ="/Users/fachridjohar/BACKEND/basic_java/src/day3/FileHandling/test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine())!= null){ // juga bisa pakai for
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
