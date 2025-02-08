package day3.InnerClass;
/*
*  INNER CLASS : class dalam class inner clas bisa ngeakses atribut dan method milik oter class
* implementasi inner class  bisa di pakai ketika mau bikin struktur data object di dalam object
* atau untuk groping antara atribut dan fungsional
* */
public class OuterClass {
    private  String  outerVar = "10";

    public  class InnerClass{
        public void  display(){
            System.out.println("outer var = " + outerVar);
        }

    }
    public  static void main(String[]args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
/* Visual :
* const outer = {
*                    outerVar = 10;
*                    innerClass= {
*                                   inner= outerVar;
*                                 }
*                }
* */