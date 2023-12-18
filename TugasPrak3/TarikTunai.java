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
public class TarikTunai extends Tabungan{
    int tarik, nominalTarik;
    
    public TarikTunai(int saldoAwal){
        super(saldoAwal);
    }
    
    void NominalTarik(int nominalTarik){
        this.nominalTarik = nominalTarik;
    }
    
    int TarikUang(){
        tarik = saldoAwal - nominalTarik;
        return tarik;
    }
}
