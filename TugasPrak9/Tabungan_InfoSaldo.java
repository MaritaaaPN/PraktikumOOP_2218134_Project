/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak9;

import TugasPrak8.*;
import TugasPrak7.*;
import TugasPrak6.*;
import TugasPrak5.*;

/**
 *
 * @author kirun
 */
public class Tabungan_InfoSaldo extends Abs_TabunganSiswa{
    //atribut
    String tanggal, nama, jenis, sekolah, alamat;
    private int noTabungan, infoSaldo;
    private int saldoAwal, admin, BiayaAdmin;
    
    //konstruktor
    public Tabungan_InfoSaldo(){
        saldoAwal = 2000000 ;
        admin = 5000;
    }
    
    //enkapsulasi method setter getter
    public int getnoTabungan(){
        return noTabungan;
    }
    public void setnoTabungan(int noTabungan){
        this.noTabungan = noTabungan;
    }
    public int getinfoSaldo(){
        return infoSaldo;
    }
    public void setinfoSaldo(int infoSaldo){
        this.infoSaldo = infoSaldo;
    }
    public int getsaldoAwal(){
        return saldoAwal;
    }
    public void setsaldoAwal(int saldoAwal){
        this.saldoAwal = saldoAwal;
    }
    public int getBiayaAdmin(){
        return admin;
    }
    public void setBiayaAdmin(int admin){
        this.admin = admin;
    }
    
    @Override
    //method override
    int infoSaldo(){ 
        return saldoAwal;
    }
}
