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
public class Keramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dalam kasus ini saya langsung bulatkan untuk ukuran keramik dan luasnya, yang tadinya luasnya 100m kuadrat menjadi 1000000
        
        CodeHitung keramikA = new CodeHitung (900, 1000000);
        // 900 didapatkan dari ukuran 30 x 30
        // 1000000 didapatkan dari konversi luas 100m kuadrat menjadi cm 
        System.out.println("----- KERAMIK A -----");
        System.out.println("Banyak keramik yang dibutuhkan adalah : " + keramikA.keramikA());
        System.out.println("Jadi biaya yang harus dikeluarkan adalah : " + keramikA.biaya + "\n");
        
        
        CodeHitung keramikB = new CodeHitung (1600, 1000000);
        // 1600 didapatkan dari ukuran 40 x 40
        // 1000000 didapatkan dari konversi luas 100m kuadrat menjadi cm
        System.out.println("----- KERAMIK B -----");
        System.out.println("Banyak keramik yang dibutuhkan adalah : " + keramikB.keramikB());
        System.out.println("Jadi biaya yang harus dikeluarkan adalah : " + keramikB.biaya + "\n");
        
        CodeHitung keramikC = new CodeHitung (1200, 1000000);
        // 1200 didapatkan dari ukuran 30 x 40
        // 1000000 didapatkan dari konversi luas 100m kuadrat menjadi cm
        System.out.println("----- KERAMIK C -----");
        System.out.println("Banyak keramik yang dibutuhkan adalah : " + keramikC.keramikC());
        System.out.println("Jadi biaya yang harus dikeluarkan adalah : " + keramikC.biaya + "\n");
        
        CodeHitung hasil = new CodeHitung(0, 0);
        hasil.hasil();
    
    }
    
}
