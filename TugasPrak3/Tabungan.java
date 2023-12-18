/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak3;

/**
 *
 * @author kirun
 */
public class Tabungan {
    //atribut
    String nama, sekolah, alamat, tanggal, validasi;
    int noTabungan, saldoAwal;
    
    //method konstruktor untuk menginisialisasi nilai saldoAwal
    public Tabungan(int saldoAwal){
        this.saldoAwal = saldoAwal;
    }
    
    //method
    void dataNo(int noTabungan){
        this.noTabungan = noTabungan;
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
    void dataTanggal(String Tanggal){
        this.tanggal = Tanggal;
    }
    void Validasi(String Validasi){
        this.validasi = Validasi;
    }
}