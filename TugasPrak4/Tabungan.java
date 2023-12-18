/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak4;

/**
 *
 * @author kirun
 */
public class Tabungan {
    //atribut
    public String nama, sekolah, alamat, tanggal, validasi;
    private int noTabungan, saldoAwal;
    
    //method konstruktor
    public Tabungan(int saldoAwal){
        this.noTabungan = 2218134;
        this.saldoAwal = saldoAwal;
    }
    
    //enkapsulasi method setter getter
    public int getnoTabungan(){
        return noTabungan;
    }
    public void setnoTabungan(int noTabungan){
        this.noTabungan = noTabungan;
    }
    public int getsaldoAwal(){
        return saldoAwal;
    }
    public void setsaldoAwal(int saldoAwal){
        this.saldoAwal = saldoAwal;
    }
    
    //method
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
