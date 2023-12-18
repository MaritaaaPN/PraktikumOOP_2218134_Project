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
public class SetorTunai extends Tabungan{
    int setor, nominalSetor;
    
    public SetorTunai(int saldoAwal){
        super(saldoAwal);
    }
    
    void NominalSetor(int nominalSetor){
        this.nominalSetor = nominalSetor;
    }
    
    int SetorUang(){
        setor = saldoAwal + nominalSetor;
        return setor;
    }
}
