/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_03;

/**
 *
 * @author ica
 */
class PembayaranGaji {
   public int hitungGaji(Pegawai peg){
       int uang=peg.gaji();
       if(peg instanceof Direktur)
           uang+=((Direktur)peg).tunjangan();
       if(peg instanceof Staf)
           uang+=((Staf)peg).Bonus();
       return uang;
   } 
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf toni = new Staf();
        Direktur tito = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf     : " + pg.hitungGaji(toni));
        System.out.println("Gaji yang dibayarkan kepada Direktur: " + pg.hitungGaji(tito));        
    }
}
