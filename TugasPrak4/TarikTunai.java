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
public class TarikTunai extends Tabungan{
    private int tarik, nominalTarik;
    
    public TarikTunai(int saldoAwal){
        super(saldoAwal);
    }
    
    public int getnominalTarik(){
        return nominalTarik;
    }
    public void setnominalTarik(int nominalTarik){
        this.nominalTarik = nominalTarik;
    }
    
    int TarikUang(){
        tarik = getsaldoAwal() - nominalTarik;
        return tarik;
    }
}
