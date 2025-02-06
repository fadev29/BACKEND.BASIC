package day2.OOP.Blogs.Test;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private String title;
    private String content;
    private List<mahasiswa>myStudents;


    public Student(String blogTitle, String blogContent){
        title = blogTitle;
        content = blogContent;
        myStudents = new ArrayList<>();
    }


    public class mahasiswa {
        private String name;
        private int NIM;
        private int nilai;

        public mahasiswa (String nama, int id, int nil){
            name = nama;
            NIM = id;
            nilai = nil;

        }
        public  String getName(){return name;}
        public int getNIM(){return NIM;}
        public  int getNilai(){return nilai;}
    }
    public  void addmahasiswa(String name, int NIM, int nilai){
        mahasiswa newmahasiswa = new mahasiswa(name,NIM,nilai);
        myStudents.add(newmahasiswa);
    }


    public void dispalyStudent(){
        for (mahasiswa mahasiswa : myStudents){
            System.out.println("Nama mhs : " + mahasiswa.getName());
            System.out.println("nomor induk mahasiswa : " + mahasiswa.getNIM());
            System.out.println("nilai siswa : " + mahasiswa.getNilai());
        }
    }

    public void ratarata(){
        int total = 0;
        int max = 0;
        for (mahasiswa mahasiswa : myStudents){
            total+=mahasiswa.nilai;
            max = Math.max(max,mahasiswa.nilai);
        }
        double rata2 = total/myStudents.size();
        System.out.println("rata-rata nilai adalah" + rata2);
        System.out.println("nilai tertinggi :" + max);
        System.out.println("Mahasiswa Nilai tertinggi : ");
        for (mahasiswa mahasiswa : myStudents){

          if(mahasiswa.nilai >= rata2){
              System.out.println("nama :"+ mahasiswa.name);
              System.out.println("nim : " + mahasiswa.NIM);
              System.out.println("nilai : " + mahasiswa.nilai);
          }
        }

    }





}
