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
public class SetorTunai extends Tabungan{
    private int setor, nominalSetor;
    
    public SetorTunai(int saldoAwal){
        super(saldoAwal);
    }
    
    public int getnominalSetor(){
        return nominalSetor;
    }
    public void setnominalSetor(int nominalSetor){
        this.nominalSetor = nominalSetor;
    }
    
    int SetorUang(){
        setor = getsaldoAwal() + nominalSetor;
        return setor;
    }
}
