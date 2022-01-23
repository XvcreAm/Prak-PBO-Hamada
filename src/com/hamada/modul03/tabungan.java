package com.hamada.modul03;

public class tabungan {
    //Attribute
    public int saldo;

    // Constructor method
    public tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int Saldo() {
        return saldo;
    }

    // Method
    public int SimpanUang(int jumlah) {
        return saldo = saldo + jumlah;
    }

    public boolean Ambiluang(int jumlah) {
        if (saldo - jumlah < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
}

