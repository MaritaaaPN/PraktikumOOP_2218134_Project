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
import static TugasPrak8.Dapat_BiayaAdmin.admin;

/**
 *
 * @author kirun
 */
public class Tabungan_TarikTunai extends Abs_TabunganSiswa implements Dapat_BiayaAdmin{
    //atribut
    private int saldoAwal, noSetor, noTarik, infoSaldo, admin, BiayaAdmin;
    String tanggal;
    
    //konstruktor
    public Tabungan_TarikTunai(){
        saldoAwal = 2000000 ;
        admin = 5000; 
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
    public int getnoSetor(){
        return noSetor;
    }
    public void setnoSetor(int noSetor){
        this.noSetor = noSetor;
    }
    public int getnoTarik(){
        return noTarik;
    }
    public void setnoTarik(int noTarik){
        this.noTarik = noTarik;
    }
    public int getinfoSaldo(){
        return infoSaldo;
    }
    public void setinfoSaldo(int infoSaldo){
        this.infoSaldo = infoSaldo;
    }
    
    @Override
    //method override
    int infoSaldo(){ 
        return saldoAwal + noSetor - noTarik; 
    }
    
    @Override
    //method interface
    public int BiayaAdmin(){
        if(noTarik >= 2000000){
            infoSaldo = (saldoAwal + noSetor - noTarik) - admin;
        }
        if(noTarik <= 2000000){
            infoSaldo = saldoAwal + noSetor - noTarik;
        }
        return infoSaldo;
    }
}
