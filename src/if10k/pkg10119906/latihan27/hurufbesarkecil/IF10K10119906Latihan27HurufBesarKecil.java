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
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println("===Program Mengganti Kata===");
        
        System.out.print("\nMasukan Kalimat\t : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata\t : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata\t : ");
        nJadi = scanner.nextLine();
        
        System.out.println("\n=====Hasil=====");
        System.out.println("Kalimat Awal : " + Kalimat);
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("Kalimat Baru : " + ganti);
    }
    
}
