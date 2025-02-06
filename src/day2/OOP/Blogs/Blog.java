package day2.OOP.Blogs;

import java.util.ArrayList;
import java.util.List;

/* ENKAPSULASI : cara untuk membatasi dan melindungi data/method dari access langsung
* untuk meningkatkan keamanan dari perubahan data yang tidak di sengaja/sengaja
* */
public class Blog {
    // enkapsulasi adalah ini :
    private String title;
    private String content;
    // List : interface yang nandain bahwa variabel ini adalah sebuah List/Daftar/array
    private List<Comment> comments;

    public Blog(String blogTitle, String blogContent){
        title = blogTitle;
        content = blogContent;
        // ArrayList buat nyimpen data dalam bentuk array
        comments = new ArrayList<>();
    }

    // getter blog
    public  String getTitle(){return title;}
    public  void setTitle(String newtitle){title = newtitle;}
    public String getContent(){return content;}
    public  void setContent(String newContent){content = newContent;}

    // method blog
    public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("content : " + content);
    }


    // inner class : class yg terdapat di dalam class
    public class  Comment {
        private String author;
        private  String text;

        public Comment(String name, String comment){
            author = name;
            text = comment;
        }
        // getter
        public String getAuthor(){return author;}
        public String getText(){return text;}

    }

    // method buat nambahin comment ke blog
     public  void addComment(String author, String text){
        Comment newComment = new Comment(author,text);
        comments.add(newComment);
     }
     public void displayComemnt(){
        setContent("Comment : ");
        for(Comment comment : comments){
            System.out.println("Author : " + comment.getAuthor());
            System.out.println("Text : " + comment.getText());
        }
     }
}
