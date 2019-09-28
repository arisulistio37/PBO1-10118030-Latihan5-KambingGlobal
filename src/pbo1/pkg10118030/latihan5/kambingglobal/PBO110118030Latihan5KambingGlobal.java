/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118030.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 */
public class PBO110118030Latihan5KambingGlobal {
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getjumlahKambing() {
        System.out.println("Jumlah kambing: " +jumlahKambing); 
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 6;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO110118030Latihan5KambingGlobal kambingSusu = new PBO110118030Latihan5KambingGlobal ();
        
        // Menampilkan jumlah kambing yang ada saat program pertama kali bejalan
        kambingSusu.getjumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
    }
    
}
