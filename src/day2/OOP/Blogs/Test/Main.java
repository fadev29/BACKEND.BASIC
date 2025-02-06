package day2.OOP.Blogs.Test;

import java.util.ArrayList;

/*
*  1. buat object/ class Student dengan atribut nama, NIM, dan nilai
* lalu simpan data Student tersebut ke dalam arrayList
* kemudian buat method berikut :
* 1. menghitung rata-rata nilai Student
* 2. cari nilai tertinggi
* 3. dan tampilkan data student dengan nilai di atas rata-rata
* */
public class Main {
    public static void main(String[] args) {

    Student myStudent = new Student("Student","tugas");
        myStudent.addmahasiswa("fachri",123040404,90);
        myStudent.addmahasiswa("fauzi",1617141567,80);
        myStudent.addmahasiswa("fauzia",111213141,70);
        myStudent.dispalyStudent();
        myStudent.ratarata();
    }

}

