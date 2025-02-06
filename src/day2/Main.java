package day2;
import day2.OOP.Blogs.Student.Student;
import day2.OOP.Blogs.Blog;
import day2.OOP.Blogs.Users.Admin;
import day2.OOP.Blogs.Users.User;

public class Main {
    // class biasa
    public static void main(String[] args) {
        System.out.println("=== GET STUDENT ===");
        Student s1 = new Student("fachri",70);
        s1.cekStatus();

        Student s2 = new Student("Fauzi", 95);
        s2.name = "Fachri"; // update data
        s2.score = 90;
        s2.cekStatus();
        //enkapsulasi
        System.out.println("======== GET BLOGS ========");
        Blog myBlog = new Blog("Bootcam Aigen Bacth 3", "Open Resitration" );
        myBlog.displayInfo();
        myBlog.getTitle();// buat nampilin title
        myBlog.setTitle("Bootcamp Aigen Batch 4"); // buat set/update data title
        myBlog.setContent("Pendaftaran di tutup");
        myBlog.displayInfo();

        // comment :
        myBlog.addComment("fachri", "apakah masi ada ?");
        myBlog.addComment("ridho", "bayar ga gan");
        myBlog.displayComemnt();

        System.out.println("======== GET USERS ========");
        // class parent
        User userGues = new User("imron");
        userGues.displayInfo();
        // class child
        Admin userAdmin = new Admin("alwi",true);
        userAdmin.displayInfo();

    }
}
