package com.hamada.modul02;

import java.util.Scanner;

public class soalan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukan Nilai a : ");
        a = scan.nextInt();
        System.out.print("Masukan Nilai b : ");
        b = scan.nextInt();
        System.out.print("Masukan Nilai c : ");
        c = scan.nextInt();
        System.out.println("Hasil dari  A+B-C Adalah : "+(a+b-c));
    }
}
