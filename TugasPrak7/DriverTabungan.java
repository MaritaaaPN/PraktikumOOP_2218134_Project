/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak7;



/**
 *
 * @author kirun
 */
public class DriverTabungan {
    public static void main (String []args){
        //membuat objek manusia
        Tabungan tabungan = new Tabungan();
        
        //Membuat objek Apel dan Pisang
        Abs_TabunganSiswa info = new Tabungan_InfoSaldo();
        Abs_TabunganSiswa setor = new Tabungan_SetorTunai();
        Abs_TabunganSiswa tarik = new Tabungan_TarikTunai();
        
        //Memanggil metode makanBuah()pada Manusia untuk objek Apel dan Pisang
//        tabungan.infoSaldo(tabungan); //Output : Mkaan apel dengan digigit
//        manusia.makanBuah(pisang); //Output : Kupas pisang sebelum dimakan
    }
}
