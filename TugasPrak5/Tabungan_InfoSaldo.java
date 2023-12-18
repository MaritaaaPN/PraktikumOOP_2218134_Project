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
public class Tabungan_InfoSaldo extends Tabungan_Siswa{
    //atribut
    int saldoAwal;
    
    @Override
    //method override
    int infoSaldo(){ 
        return saldo();
    }
}
