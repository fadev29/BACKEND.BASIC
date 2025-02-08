package day3.Enums;

import java.util.EnumSet;
import java.util.Set;
// ENUM : bisa juga disimpan kedalam set
public class EnumSetOf {
    enum Menu{
        INDOMI,
        PECEL_AYAM,
        ES_TEH,
        KOPI,
        ES_TELER,
        ES_DURIAN;
    }

    public static void main(String[] args) {
        // nambahin menu kedalam set
        Set<Menu> availableMenu = EnumSet.of(Menu.INDOMI, Menu.PECEL_AYAM);

        // nambahin menulain
        availableMenu.add(Menu.ES_TEH);

        // cek menu ada kaga
        if(availableMenu.contains(Menu.ES_TEH)){
            System.out.println("menu is available");
        }else {
            System.out.println("out of stock");
        }
        System.out.println("Tondays menu :  " + availableMenu);
    }
}
