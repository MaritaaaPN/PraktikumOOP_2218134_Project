/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak2;

/**
 *
 * @author kirun
 */
public class Keuangan_Tabungan {
    public class Keuangan {
    String nama, sekolah, alamat, tanggal, validasi;
    int noTabungan, pemasukan, penarikan, saldo;
    
    //menginisialisasi nilai tanggal dan pemasukan dengan konstruktor
    public Keuangan(){
        this.tanggal = "18 Oktober 2023";
        this.pemasukan = 200000;
    }
    //method perhitungan saldo
    public int saldo(){
        saldo = pemasukan - penarikan;
        return saldo;
    }
    
    void dataTabungan(int NoTabungan){
        noTabungan =  NoTabungan;
    }
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataSekolah(String Sekolah){
        this.sekolah = Sekolah;
    }
    void dataAlamat(String Alamat){
        this.alamat = Alamat;
    } 
    void dataPenarikan(int Penarikan){
        penarikan = Penarikan;
    }
    void Validasi(String Validasi){
        this.validasi = Validasi;
    }
 
    int cetakTabungan(){
        return noTabungan;
    }
    String cetakNama(){
        return nama;
    }
    String cetakSekolah(){
        return sekolah;
    }
    String cetakAlamat(){
        return alamat;
    }
    String cetakTanggal(){
        return tanggal;
    }
    int cetakPemasukan(){
        return pemasukan;
    }
    int cetakPenarikan(){
        return penarikan;
    }
    String cetakValidasi(){
        return validasi;
    }
}
}