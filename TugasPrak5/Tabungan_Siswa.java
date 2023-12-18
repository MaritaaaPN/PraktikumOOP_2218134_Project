/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak5;

/**
 *
 * @author kirun
 */
public class Tabungan_Siswa {
    //atribut
    String tanggal, nama, jenis, sekolah, alamat;
    int noTabungan, infoSaldo, saldoAwal, noSetor, noTarik;
    
    //konstruktor
    public Tabungan_Siswa(){
        saldoAwal = 6000000 ;
    }
    
    //method overloading
    int saldo(){ 
        infoSaldo = saldoAwal;
        return infoSaldo;
    }
    int saldo(int noSetor){ 
        infoSaldo = saldoAwal + noSetor;
        return infoSaldo;
    }
    int saldo(int noSetor, int noTarik){ 
        infoSaldo = saldoAwal + noSetor - noTarik;
        return infoSaldo;
    }
    
    //method overriding
    int infoSaldo(){
        return 0;
    }
    
    //method tampilan atribut 
    void dataNoTabungan(int noTabungan){
        this.noTabungan = noTabungan;
    }
    void dataTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    void dataNama(String nama){
        this.nama = nama;
    }
    void dataJenis(String jenis){
        this.jenis = jenis;
    }
    void dataSekolah(String sekolah){
        this.sekolah = sekolah;
    }
    void dataAlamat(String alamat){
        this.alamat = alamat;
    }
    void dataInfoSaldo(int infoSaldo){
        this.infoSaldo = infoSaldo;
    }
 
    int noTabungan(){
        return noTabungan;
    }
    String cetakTanggal(){
        return tanggal;
    }
    String cetakNama(){
        return nama;
    }
    String cetakJenis(){
        return jenis;
    }
    String cetakSekolah(){
        return sekolah;
    }
    String cetakAlamat(){
        return alamat;
    }
    int cetakInfoSaldo(){
        return infoSaldo;
    }
}
