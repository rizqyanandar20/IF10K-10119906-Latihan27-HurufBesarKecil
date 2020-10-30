/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda RUsmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Deskripsi Program : menggati kalimat awal dengan inputan.
 */
public class IF10K10119906Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String kalimat, kalimatHurufBesar, kalimatHurufKecil;

        System.out.print("Masukkan kalimat : ");
        kalimat = scanner.nextLine();
        
        System.out.println();

        kalimatHurufBesar = kalimat.toUpperCase();
        kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
    }
    
}
