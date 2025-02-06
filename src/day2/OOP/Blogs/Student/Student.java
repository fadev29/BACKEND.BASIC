package day2.OOP.Blogs.Student;

public class Student {
    public String name;
    public int score;
    private Boolean isPass;

    public Student(String StudentName, int StudentScore){
        name = StudentName;
        score = StudentScore;
        isPass = false;
    }
    public void cekStatus(){
        if(score >= 85){
            isPass = true;
            System.out.println("name : " + name + ", score : " + score + ", isPass : " + isPass);
            System.out.println("Status :  Lulus");
        } else {
            System.out.println("name : " + name + ", score : " + score + ", isPass : " + isPass);
            System.out.println("Status : Tidak Lulus!");
        }
    }
}
