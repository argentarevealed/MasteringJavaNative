
//Biodata menggunakan tipedata 01.
//  public class Modul3 {

//     public static void main(String[] args) {
//         String nama,alamat;
//         int usia;
//         double tinggi;

//         nama = "Nevada p.r";
//         alamat = "Las Vegas";
//         usia = 18;
//         tinggi = 190.5;

//         System.out.println("Biodata Nevada");
//         System.out.print(" Nama : "+nama);
//         System.out.println(" Alamat : "+alamat);
//         System.out.println(" Usia : "+usia);
//         System.out.println(" Tinggi : "+tinggi);
//     }
// }



//Tipe data integer 02
// public class Modul3 {

//     public static void main(String[] args) {
//         int a =2; int b =4;
//         b += a;
//         System.out.println("B += A Hasilnya : "+b);
//         b -= a;
//         System.out.println("B -= A Hasilnya : "+b);
//     }
// }



//Tipe data karakter 03.
// public class Modul3 {

//     public static void main(String[] args) {
//         char ch1 = 'A';
//         char ch2 = 'B';

//         System.out.println("Char ch1 : "+ch1);
//         System.out.println("Char ch2 : "+ch2);
//         System.out.println("\n");

//         char ch = 'A';

//         System.out.println("ch ="+ch);
//         ch++;
//         System.out.println("ch ="+ch);
//         ch++;
//         System.out.println("ch ="+ch);
//         ch++;
//         System.out.println("\n");
//     }
// }




/**
 * Modul3
 */
// import javax.swing.JOptionPane;

// public class Modul3 {

//     public static void main(String[] args) {

//         final double pi = 3.14159;

//         int jari2;
//         double luas;

//         jari2 = 7;
//         luas = pi * jari2 * jari2;

//         JOptionPane.showMessageDialog(null, "jari-jari lingkaran :"+jari2 + "\nluas lingkaran = "+luas, "Menghitung luas", JOptionPane.INFORMATION_MESSAGE);

//         System.exit(0);

//     }
// }




//Menghitung keliling (Ada fungsi konensi string ke integer)
/**
 * Modul3
 */
import javax.swing.JOptionPane;
public class Modul3 {

    public static void main(String[] args) {
        final double pi = 3.14159;

        int jari2;
        double keliling;
        String sJari2;

        sJari2 = JOptionPane.showInputDialog(null,
        "Masukkan jari-jari lingkaran \ndengan tipe data integer",
        "input data jari jari", JOptionPane.QUESTION_MESSAGE);

        jari2 = Integer.parseInt(sJari2);

        keliling = 2 * pi * jari2;

        JOptionPane.showMessageDialog(null, "jari-jari lingkaran = "+
        jari2 + " \n Keliling lingkaran : "+keliling,
        "Keliling lingkaran", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}


//konfrensi fahrenheit ke celcius
// import javax.swing.JOptionPane;

/**
 * Modul3
 */
// public class Modul3 {

//     public static void main(final String[] args) {
//         String Sfahrenhet;
//         double fah,cal;

//         Sfahrenhet = JOptionPane.showInputDialog(null, "Masukkan derajat fahrenheit : ","Fahrenheit ke calcius", JOptionPane.QUESTION_MESSAGE);

//         fah = Double.parseDouble(Sfahrenhet);

//         cal = (int) ((5.0 / 9) * (fah - 32) * 100) / 100.0;

//         JOptionPane.showMessageDialog(null, "Suhu dalam fahrenhet "+fah +"\n celcius : "+cal, "Fahrenhet ke celcius", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }
// }



