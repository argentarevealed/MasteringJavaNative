//Pehitungan aritmatika
/**
 * Modul4
 */

import java.util.Scanner;
public class Modul4 {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboa = new Scanner(System.id);
        System.out.println("Pertambahan");
        System.out.print("Masukkan angka pertama");
        angka1 = keyboa.nextInt();
        System.out.print("Masukkan angka kedua");
        angka2 = keyboa.nextInt();

        hasil = angka1+angka2;

        System.out.println("Hasilnya adalah: "+hasil);
    }
    
}