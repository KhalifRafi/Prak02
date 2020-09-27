/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;

/**
 *
 * @author LENOVO
 */
public class CodeHitung {
    // ATRIBUT
    int ukuran;
    int luas;
    int biaya;
    
    // CONSTRUCTOR
    CodeHitung(int u, int l){
        this.ukuran = u;
        this.luas = l;
    }
    
    // METHODS
    int keramikA () {
        // Ini Banyak Keramik Dalam Satuan Biji, Belum Dalam Bentuk Per Box
        int total;
        total = this.luas / this.ukuran;
        this.biaya = total / 10 * 54000;
        return total;
        
        
        
    }
    int keramikB () {
        // Ini Banyak Keramik Dalam Satuan Biji, Belum Dalam Bentuk Per Box
        int total;
        total = this.luas / ukuran;
        this.biaya = total / 5 * 65000;
        return total;
 
    }
    
    int keramikC () {
        // Ini Banyak Keramik Dalam Satuan Biji, Belum Dalam Bentuk Per Box
        int total;
        total = this.luas / ukuran;
        this.biaya = total / 8 * 60000;
        return total;
       
    }
    
    void hasil() {
        System.out.println("SEHINGGA KERAMIK YANG TOTAL HARGA BELINYA PALING MURAH DAN SESUAI KEBUTUHAN ADALAH KERAMIK A");
    }
    
}
