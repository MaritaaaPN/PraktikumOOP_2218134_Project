/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak7;

import TugasPrak6.*;
import TugasPrak5.*;

/**
 *
 * @author kirun
 */
public class Tabungan_SetorTunai extends Abs_TabunganSiswa{
    //atribut
    private int saldoAwal, noSetor;
    
    //konstruktor
    public Tabungan_SetorTunai(){
        saldoAwal = 2000000 ;
    }
    
    public int getsaldoAwal(){
        return saldoAwal;
    }
    public void setsaldoAwal(int saldoAwal){
        this.saldoAwal = saldoAwal;
    }
    public int getnoSetor(){
        return noSetor;
    }
    public void setnoSetor(int noSetor){
        this.noSetor = noSetor;
    }
    
    @Override
    //method override
    int infoSaldo(){ 
        return saldoAwal + noSetor; 
    }
}
