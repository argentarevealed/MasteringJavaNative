// //  CARA 01
public class Modul1 {
    public static void main(String[] args) {
        int p =10;
        int l =1;
        int hasil = p*l;
        System.out.println("Luas persegi adalah : "+hasil);
    }
}


// // //      CARA 02
// import java.io.*;
// public class Modul1 {
//     static int luaspersegi(int p, int l) {
//         int luas = p*l;
//         return luas;
//     }
//     public static void main(String[] args) {
//         int p = 3;
//         int l = 2;
//         System.out.println("Luas persegi panjang ialah : "+luaspersegi(p, l));
//     }
// }


// //      CARA 03
// import java.util.Scanner;
// public class Modul1 {
//     public static void main(String[] args) {
//         int p;
//         int l;
//         double luas;
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Menghitung luas persegi panjang");
//         System.out.print("Masukkan panjang : ");
//         p = scan.nextInt();
//         System.out.print("Masukkan lebar : ");
//         l = scan.nextInt();
//         luas = p*l;
//         System.out.println("Luas persegi panjang + "+luas);
//         scan.close();
//     }
// }