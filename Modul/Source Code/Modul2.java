// CARA 1
public class Modul2 {

    public static void main(String[] args) {
        int alas = 6;
        int tinggi = 7;
        int luas = (alas*tinggi/2);
        System.out.println("Luas segitiga adalah : "+luas);
    }
}

// //      CARA 02
import java.io.*;
public class Modul1 {
    static double luassegitiga(int a, int t) {
        double luas = a*t;
        return luas;
    }
    public static void main(String[] args) {
        int p = 3;
        int l = 2;
        System.out.println("Luas Segitiga : "+luassegitiga(a, t));
    }
}


//      CARA 03
import java.util.Scanner;
public class Modul1 {
    public static void main(String[] args) {
        int p;
        int l;
        double luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung luas segitiga");
        System.out.print("Masukkan panjang : ");
        p = scan.nextInt();
        System.out.print("Alas : ");
        l = scan.nextInt();
        luas = p*l;
        System.out.println("Tinggi + "+luas);
        scan.close();
    }
}