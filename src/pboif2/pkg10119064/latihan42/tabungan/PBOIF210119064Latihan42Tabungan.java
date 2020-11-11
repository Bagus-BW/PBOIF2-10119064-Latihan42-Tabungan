/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan42.tabungan;

import java.util.Scanner;
import model.Tabungan;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk mengambil uang
 * yang berada di dalam tabungan
 */
public class PBOIF210119064Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahAmbil;
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        //inisialisasi objek tabungan
        Tabungan tabungan = new Tabungan(keyboard.nextInt());
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlahAmbil = tabungan.ambilUang(keyboard.nextInt());
        System.out.println("Saldo Anda Sekarang : " + jumlahAmbil);
        
        
        
    }
    
}
