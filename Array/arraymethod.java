// Library
	import java.util.ArrayList;
	import java.util.Scanner;

public class arraymethod {
    public static void main(String[] args) {
        String namaTeman1 = "Linda";
        String namaTeman2 = "Santi";
        String namaTeman3 = "Susan";
        String namaTeman4 = "Mila";
        String namaTeman5 = "Ayu";

        System.out.println(namaTeman1);
        System.out.println(namaTeman2);
        System.out.println(namaTeman3);
        System.out.println(namaTeman4);
        System.out.println(namaTeman5);

//2nd method

	String[] nama = new String[5];

        nama[0] = "Linda";
        nama[1] = "Santi";
        nama[2] = "Susan";
        nama[3] = "Mila";
        nama[4] = "Ayu";

        System.out.println("Nama : "+nama[2]);

//3rd method

	String[] nama3mt = {"Linda","Santi", "Susan", "Mila", "Ayu"};
        for(int i = 0; i<nama3mt.length; i++){
            System.out.println("Indeks ke-"+i+": "+nama3mt[i]);

// 4th method


        String[] buah = new String[5];

        Scanner scan = new Scanner(System.in);

        for (int i4th = 0; i<buah.length; i4th++){
            System.out.println("Buah ke-"+i4th+": ");
            buah[i4th] = scan.nextLine();
        }

        System.out.println("-----------------");


        for (String b : buah){
            System.out.println(b);
        }

// 5th array list

	ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("Tikus");
        kantongAjaib.add("12341234.123");
        kantongAjaib.add(true);

        kantongAjaib.remove("Tikus");

        System.out.println(kantongAjaib);

        System.out.println("Kantong ajaib berisi "+kantongAjaib.size()+" item");

//6th array list

	String[][] kontak ={
                {"Lili","0812345"},
                {"Lala","0987654"},
                {"Lulu","0158375"}
        };

        for (int x = 0; x < kontak.length; x++) {
            System.out.println("Nama : "+kontak[x][0]);
            System.out.println("Nomer : "+kontak[x][1]);
            System.out.println("------------------");
        }

// 7th array with Scanner


        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scanlist = new Scanner(System.in);

        //mengisi setiap meja
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }

        //menampilkan isi array
        System.out.println("----------------");
        for (int bar = 0; bar < meja.length; bar++){
            for (int kol = 0; kol<meja[bar].length;kol++) {
                System.out.format(" | %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------");

// 8th Array list

	        ArrayList genre = new ArrayList();
        System.out.println("");
        System.out.println(" Berikut adalah Jenis Genre EDM");
        genre.add("|  Dubstep          |");
        genre.add("|  Future Bounce    |");
        genre.add("|  Melbourne Bounce |");
        genre.add("|  Deep House       |");
        genre.add("|  Dangdut          |");
        System.out.println("---------------------");
        genre.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("~ Ups, Dangdut bukan genre EDM " +
                            "Maka harus dihapus ~");
        genre.remove("|  Dangdut          |");
        System.out.println("");
        System.out.println("---------------------");
        genre.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("~ Dangdut berhasil dihapus ~");
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("| Genre terdiri dari "+ genre.size()+ " macam jenis |");
        System.out.println("------------------------------------");

// 9th Array

	

    }
  }
}
