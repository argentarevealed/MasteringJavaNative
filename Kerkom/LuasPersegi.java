package kerkom01;

import java.util.Scanner;

public class Cara03{
    public static void main(String[] args) {
        System.out.println("Menghitung luas persegi panjang");
        int p;
        double l;
        double hasil;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan panjang");
        p = input1.nextInt();
        System.out.println("Masukkan lebar");
        l = input1.nextDouble();
        hasil = p*l;
        System.out.println("Hasilnya adalah : "+hasil);
    }
}