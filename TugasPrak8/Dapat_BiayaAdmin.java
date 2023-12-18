/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPrak8;

/**
 *
 * @author kirun
 */
public interface Dapat_BiayaAdmin {
    //atribut dianggap sebagai konstanta (tidak bisa diubah nilainya / final)
    int admin = 5000;

    //otomatis menjadi method abstract, maka wajib diturunkan semua
    int BiayaAdmin();
}
