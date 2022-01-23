package com.hamada.modul03;

public class Isi_Tabungan {
    public static void main(String[] args) {
        //construct objek 't' dari class 'Tabungan' dengan nilai saldo awal sebesar 5000
        tabungan t = new tabungan(5000);

        //output nilai saldo
        System.out.println("Saldo awal tabungan Anda: " + t.saldo);

        //panggil method AmbilUang()
        t.Ambiluang(5000);

        //Output
        System.out.println("Jumlah uang yang d ambil : 1500");

        //Output
        System.out.println("Saldo Tabungan anda sekarang adalah: " + t.saldo);
    }
}
