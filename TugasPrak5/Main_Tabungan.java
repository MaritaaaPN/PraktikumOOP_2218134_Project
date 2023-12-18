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
public class Main_Tabungan {
    public static void main (String [] args){
        Tabungan_InfoSaldo info = new Tabungan_InfoSaldo();
        Tabungan_SetorTunai setor = new Tabungan_SetorTunai();
        setor.noSetor = 1500000;
        Tabungan_TarikTunai tarik = new Tabungan_TarikTunai();
        tarik.noSetor = 2000000;
        tarik.noTarik = 2500000;
        
        System.out.println("Informasi Saldo Awal : " + info.infoSaldo());
        System.out.println("Setor Tunai : " + setor.infoSaldo());
        System.out.println("Tarik Tunai : " + tarik.infoSaldo());
    }
}
