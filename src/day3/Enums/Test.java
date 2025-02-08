package day3.Enums;

import day3.Equals.User;

import java.util.EnumSet;
import java.util.Set;

/* ENUM Test :
*  1. Buat class untuk menggelolah hak akses user menggunakan role dengan spesifikasi berikut :
*    - Buat enum Useraccess dengan nilai : CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, DAN USER_MANAGEMENT;
*    - Buat enum Role yang masing masing role punya akses berikut :
*       -ADMIN punya semua akses
*       -EDITOR punya akses CREATE, EDIT, DAN DISPLAY_DASHBOARD
*       -GUEST cuma punya akses DISPLAY_DASHBOARD
*    -buat kelas User dangan atribut name dan role
*    -buat method untuk validasi dan menampilkan apkah user punya hak akses tertentu
*    - buat main method untuk eksekusi di dalam satu file
*
* */
public class Test {
    private enum userAccess{
        CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, USER_MANAGEMENT;
    }
    private enum Role{
        ADMIN(EnumSet.of(userAccess.CREATE,userAccess.EDIT,userAccess.DELETE,userAccess.DISPLAY_DASHBOARD,userAccess.USER_MANAGEMENT)),
        EDITOR(EnumSet.of(userAccess.CREATE,userAccess.EDIT,userAccess.DISPLAY_DASHBOARD)),
        GUEST(EnumSet.of(userAccess.DISPLAY_DASHBOARD));


        EnumSet<userAccess> accesses;
        Role(EnumSet<userAccess> accesses){
            this.accesses = accesses;
        }
    }
    public static class User {
        private String username;
        private  Role role;

        public User(String username, Role role){
            this.username = username;
            this.role = role;
        }

        public void cekrole(userAccess access){
            if(role.accesses.contains(access)){
                System.out.println(username + "adalah" + role + "dan memiliki akses" + access);
            }else {
                System.out.println(username + "memiliki role yang salah");
            }
        }

    }

    public static void main(String[] args) {
        User fahri = new User("fachri",Role.EDITOR);
        fahri.cekrole(userAccess.DISPLAY_DASHBOARD);
    }
}
