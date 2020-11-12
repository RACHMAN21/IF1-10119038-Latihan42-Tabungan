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
 * Deskripsi Program : program ini berisi untuk menampilkan hasil penarikan uang
 *                     Tabungan dengan konsep pendekatan object oriented
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabungan tabungan = new Tabungan(0);
        System.out.println("====Program Penarikan Uang====");
        // memasukkan saldo awal
        System.out.print("Masukkan Saldo Awal      : ");
        tabungan.setSaldo(sc.nextInt());
        // memeasukkan jumlah saldo yang akan diambil
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = sc.nextInt();
        // jumlah saldo setelah diambil
        System.out.println("Saldo Anda Sekarang\t     : " + tabungan.ambilUang(jumlah));
    }
}