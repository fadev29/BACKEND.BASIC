package day3.FileHandling;
import java.io.*;
public class EditFile {
    public static void main(String[] args) {
        String fileName = "/Users/fachridjohar/BACKEND/basic_java/src/day3/FileHandling/kamu.txt";
        File file = new File(fileName);

        // buat konten baru setelah pengeditan
        StringBuilder newContent = new StringBuilder();

        // cek file ada kaga
        if(file.exists()){
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                for(String line;(line = reader.readLine()) != null;){
                    line = line.replace(" meninggalkan","kamilah");
                    newContent.append(line).append(System.lineSeparator());
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            // tulis konten yang di edit ke file yang sama
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(newContent.toString());
                // ini buat content baru
                writer.append("qwertyujksdfghjk").append(System.lineSeparator());
                System.out.println("File berhasil diedit\n path :      " + file.getAbsolutePath());
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("file tidak di temukan\n path : " + file.getAbsolutePath());
        }
    }
}
