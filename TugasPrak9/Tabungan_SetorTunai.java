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
public class Tabungan_SetorTunai extends Abs_TabunganSiswa implements Dapat_BiayaAdmin{
    //atribut
    private int saldoAwal, noSetor, infoSaldo, admin, BiayaAdmin;
    String tanggal;
    
    //konstruktor
    public Tabungan_SetorTunai(){
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
    public int getinfoSaldo(){
        return infoSaldo;
    }
    public void setinfoSaldo(int infoSaldo){
        this.infoSaldo = infoSaldo;
    }
    
    @Override 
    //method override
    int infoSaldo(){ 
        return saldoAwal + noSetor; 
    }
    
    @Override
    //method interface
    public int BiayaAdmin(){
        if(noSetor >= 2000000){
            infoSaldo = (saldoAwal + noSetor) - admin;
        }
        if(noSetor <= 2000000){
            infoSaldo = saldoAwal + noSetor;
        }
        return infoSaldo;
    }
}
