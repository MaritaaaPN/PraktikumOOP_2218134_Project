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
public class Keuangan {
    //atribut
    String nama, sekolah, alamat, tanggal, validasi;
    int noTabungan, pemasukan, penarikan, saldo;
    
    //method
    void dataTanggal(String Tanggal){
        this.tanggal = Tanggal;
    }
    void dataPenarikan(int Penarikan){
        penarikan = Penarikan;
    }
    void Validasi(String Validasi){
        this.validasi = Validasi;
    }
 
    //method untuk menampilkan pada GUI JTextarea
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
    
    //method perhitungan saldo
    public int saldo(){
        saldo = pemasukan - penarikan;
        return saldo;
    }
    
    //menginisialisasi nilai no, nama, sekolah, alamat, dan pemasukan dengan konstruktor
    public Keuangan(){
        this.noTabungan = 2218134;
        this.nama = "Marita Putri Nabila";
        this.sekolah = "SMK Negeri 90";
        this.alamat = "Jalan Bulutangkis, Batu";
        this.pemasukan = 200000;
    }
}