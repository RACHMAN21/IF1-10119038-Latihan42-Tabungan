/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan42.tabungan;

/**
  *
  * @author
  * NAMA  : Rachman Aldiansyah
  * KELAS : IF-1
  * NIM   : 10119038
  * Deskripsi Program : program ini berisi kelas tabungan
  *
  **/

public class Tabungan {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
}