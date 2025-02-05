package day1.Array;

// harus import java.util.arrays
import java.util.Arrays;

public class ArrrayMethod {
    public static void main(String[] args) {
        System.out.println("=== ARRAY BIASA ===");

        int[] numbers = {1,2,3,4,5};
        System.out.println("array length  :" + numbers.length);
        numbers[4] = 7; //buat ganti index ke 4 jadi 7

        System.out.println("=== ARRAY METHOD ===");
        System.out.println("=== SORT ===");

        Integer sortArray[] = {2,4,7,3,5,6,1};
//        method array untuk ngurutin data ASC
        Arrays.sort(sortArray);
        for (int i : sortArray) {
            System.out.println("sortArray" + i);
        }

        System.out.println("=== FILL ===");
//        method fill : method untuk mengisi semua index array dengan nilai yang sama
        int[] fillNumbers = new int[5]; // buat array dengan panjang 5 index
        Arrays.fill(fillNumbers, 7); // buat ngisi semua index array dengan angka 7
        for (int i : fillNumbers) {
            System.out.println("fill : " + i);
        }

        System.out.println("=== COPY OF ARRAY ===");

//         method buat nyalin array lain

        int[] copyArray =  Arrays.copyOf(numbers,numbers.length +1);
        for (int i : copyArray) {
            System.out.println("copy numbers : " + i);
        }
// nyalin data dari array numbers ke array newNumbers dan nambahin panjang data nya satu
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        newNumbers[5] = 50;
        for (int i : newNumbers) {
            System.out.println("copy newNumbers : " + i);
        }

        int[] Numbertertentu = Arrays.copyOfRange(numbers, 1,numbers.length + 1);
        System.out.println("array copyOfRange : " + Numbertertentu);

//        equals array : menyamakan 2 data array
        System.out.println("=== EQUALS ARRAY ===");
        int[] equalNumbers1 = {1,2,3,4,5};
        int[] equalNumbers2 = {1,2,3,4,5};
        boolean isEquals = Arrays.equals(equalNumbers1, equalNumbers2);
        System.out.println("is equal :" + isEquals);

        int search = 4;
        for (int i : equalNumbers1) {
            if (equalNumbers1[1] == search) {
                System.out.println("value 4 is exist");
                System.out.println("current value : "+ equalNumbers1[i]);
                break;
//              brek; buat ngeberhentiin proses looping ketika kondisi terpenuhi
            }
        }

        System.out.println("=== Convert to String ===");
        String arrayToString = Arrays.toString(newNumbers);
        System.out.println("array to string : " + arrayToString);
    }
}
