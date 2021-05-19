package kerkom01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Cara05 {
    public static void main(String[] args) throws IOException {

        int pilihan;
        System.out.println("");
        System.out.println("");
        System.out.println("  Aplikasi Kelompok 1");
        System.out.println("");


        Scanner pilih = new Scanner(System.in);

        System.out.println("  1. Menggunakan cara 1");
        System.out.println("  1. Menggunakan cara 2");
        System.out.println("  2. Menggunakan cara 3");
        System.out.println("");
        System.out.print("  Masukkan pilihan anda disini : ");



    while(true){
        pilihan = pilih.nextInt();

        //cara pertama
        if (pilihan == 1) { //luas

            int carasatu;
            Scanner cara1 = new Scanner(System.in);
            System.out.println("Selamat datang di cara 1");
            System.out.println("");
            System.out.println("  1. Menghitung luas");
            System.out.println("  2. Menghitung Keliling");
            System.out.println("  ");
            System.out.print("  Masukkan Pilihan anda : ");
            carasatu = cara1.nextInt();

            if (carasatu == 1) {  // Luas

                System.out.println("  Selamat datang di cara 1");
                System.out.println("");
                System.out.println("  Menghitung luas");
                System.out.println("  Dengan info sebagain berikut");
                System.out.println("  Jari-Jari = 4");
                System.out.println("  phi = 3,14");
                System.out.println("");

                final double phi = 3.14;
                double jari = 1;
                double hasil = 0.5 * phi * jari * jari;
                System.out.println("Luas Lingkaran : " + hasil);
            } else if (carasatu == 2) {  // Keliling

                System.out.println("  Menghitung Keliling lingkaran");
                System.out.println("  Dengan info sebagain berikut");
                System.out.println("  Jari-Jari = 3");
                System.out.println("  phi = 3,14");
                System.out.println("");
                final double phi = 3.14;
                double jari = 3;
                double hasil = 2 * phi * jari;
                System.out.println("Luas Lingkaran : " + hasil);
            } else {
                System.out.println("Pilihan tidak ada");
            }


            //Cara kedua

        } else if (pilihan == 2) { // Cara 2
            System.out.println("");
            System.out.println("Selamat datang di cara 2");
            int caradua;
            Scanner cara2 = new Scanner(System.in);
            System.out.println("  1. Menhitung Luas");
            System.out.println("  2. Menghitung keliling");
            System.out.println("  ");
            System.out.print("  Masukkan Pilihan : ");
            caradua = cara2.nextInt();

            if (caradua == 1) {  // Luas
                double jari;

                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("  Menghitung luas lingkaran");
                System.out.print("  Masukkan Jari-Jari = ");
                jari = input.nextInt();

                double hasil = 0.5 * 3.14 * jari * jari;

                JOptionPane.showMessageDialog(null,
                        "Jari-Jari Lingkaran = " + jari +
                                "\n Luas Lingkaran = " + hasil,
                        "Menghitung Luas", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

            } else if (caradua == 2) {  //Keliling
                double jari;
                double a = 0.5;

                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.print("    Masukkan Jari-Jari = ");
                jari = input.nextInt();

                double hasil = 2 * 3.14 * jari;

                JOptionPane.showMessageDialog(null,
                        "Jari-Jari Lingkaran = " + jari +
                                "\n Keliling Lingkaran = " + hasil,
                        "Menghitung keliling", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }


            //cara ketiga
        } else if (pilihan == 3) { // pilihan 3
            System.out.println("");
            System.out.println("Selamat datang di cara 3");
            int caratiga;
            Scanner cara3 = new Scanner(System.in);
            System.out.println("  1. Menhitung Luas");
            System.out.println("  2. Menghitung keliling");
            System.out.println("  ");
            System.out.print("  Masukkan Pilihan : ");
            caratiga = cara3.nextInt();

            if (caratiga == 1) { //luas
                System.out.println("");
                System.out.println("Menghitung Luas");
                System.out.println("");

                BufferedReader br;
                BufferedReader BufferedReader = null;

                br = new BufferedReader(new InputStreamReader(System.in));
                double phi;
                double r;
                double keliling;

                System.out.print("Inputkan nilai phi :");
                phi = Double.parseDouble(br.readLine());

                System.out.print("Inputkan nilai r :");
                r = Double.parseDouble(br.readLine());

                keliling = 0.5 * phi * r * r;
                System.out.println("Keliling Lingkaran = " + keliling);
                break;
            }else if (caratiga == 2){
                System.out.println("");
                System.out.println("Menghitung Keliling");
                System.out.println("");

                BufferedReader br;
                BufferedReader BufferedReader = null;

                br = new BufferedReader(new InputStreamReader(System.in));
                double phi;
                double r;
                double keliling;

                System.out.print("Inputkan nilai phi :");
                phi = Double.parseDouble(br.readLine());

                System.out.print("Inputkan nilai r :");
                r = Double.parseDouble(br.readLine());

                keliling = 2 * phi * r;
                System.out.println("Keliling Lingkaran = " + keliling);
                break;
            }
        }else{
            System.out.println("Pilihan salah");
            System.out.println("");
            System.out.print("Silahkan Masukkan kembali disini : ");


        }


    }

    }
}



