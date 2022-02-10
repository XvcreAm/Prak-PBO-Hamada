package com.hamada.modul03;

public class Test_Tabungan {
    public static void main(String[] args) {
        boolean status;
        tabungan tabungan = new tabungan(10000);
        System.out.println("Saldo awal : " + tabungan.Saldo());
        tabungan.SimpanUang(8000);
        System.out.println("Jumlah uang yang disimpan : 8000");
        status = tabungan.Ambiluang(7000);
        System.out.print("Jumlah uang yang diambil : 7000");
        {
            if (status)
                System.out.println(" ok");
            else {
                System.out.println(" gagal");
            }
            tabungan.SimpanUang(1000);
            System.out.println("Jumlah uang yang disimpan : 1000");
            status = tabungan.Ambiluang(10000);
            System.out.print("Jumlah uang yang diambil : 10000");
            {
                if (status)
                    System.out.println(" ok");
                else
                    System.out.println(" gagal");
            }
            status = tabungan.Ambiluang(2500);
            System.out.print("Jumlah uang yang diambil : 2500");
            {
                if (status)
                    System.out.println(" ok");
                else
                    System.out.println(" gagal");
            }
            tabungan.SimpanUang(2000);
            System.out.println("Jumlah uang yang disimpan : 2000");
            System.out.println("Saldo sekarang = " +
                    tabungan.Saldo());
        }
    }
}
