package day2.AnonymousClass;
/* ANONYMOUS CLASS : class sementara yang mewarisi class parentnya
ini cara singkat/sekali pake buat ngasih dungsi tambahan pada class dan interfacce yang udah ada
dari pada biki class baru yang terpisa
* */
public class Main {
    public static void main(String[] args) {
        User user = new User("fachri",18);

        UserInterface userActions = new UserInterface(){
            @Override
            public void displayUser() {
                System.out.println("user name : " + user.getname());
                System.out.println("user age  : " + user.getAge());
            }

            @Override
            public void updateUser() {
                System.out.println("user updated");
            }
        };
         userActions.displayUser();
        userActions.updateUser();
    }
}
