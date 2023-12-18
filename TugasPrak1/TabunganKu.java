/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak1;

/**
 *
 * @author kirun
 */
public class TabunganKu {
    public static void main(String[] args) {
    // membuat object dengan nama “tabungan” dari class "Keuangan"
    Keuangan tabungan = new Keuangan();
    //tabungan.dataTabungan(2218134);
    //tabungan.dataNama("Marita Putri Nabila");
    //tabungan.dataSekolah("SMKN 90");
    //tabungan.dataAlamat("Jalan Sudiro, Kota Batu");
    tabungan.Validasi("Ya");
    tabungan.dataTanggal("18 Oktober 2023");
    //tabungan.dataPemasukan(700000);
    tabungan.dataPenarikan(280000);
    
    System.out.println("\tTabunganKu");
    System.out.println("------------------------------------"); 
    System.out.println("No Tabungan        : " + tabungan.cetakTabungan());
    System.out.println("Nama Siswa         : " + tabungan.cetakNama()); 
    System.out.println("Asal Sekolah       : " + tabungan.cetakSekolah());
    System.out.println("Alamat Siswa       : " + tabungan.cetakAlamat()+"\n"); 
    System.out.println("Tanggal            : " + tabungan.cetakTanggal());
    System.out.println("Pemasukan          : Rp " + tabungan.cetakPemasukan());
    System.out.println("Penarikan          : Rp " + tabungan.cetakPenarikan());
    //System.out.println("Saldo              : Rp " + tabungan.hitSaldo());
    System.out.println("Validasi Transaksi : " + tabungan.cetakValidasi()); 
    }
    //ketika akan menggunakan method dari class Keuangan maka harus menyertakan nama object
}
