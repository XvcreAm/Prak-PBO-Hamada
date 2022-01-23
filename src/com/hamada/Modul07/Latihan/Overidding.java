package com.hamada.Modul07.Latihan;

public class Overidding {
    //membuat superclass Tumbuhan
    static class Tumbuhan {
        void duri() {
            System.out.println("Tumbuhan tidak berduri");
        }

        void makan() {
            System.out.println("Tumbuhan berfotosintesis");
        }
    }

    //membuat subclass Mawar yang mewarisi class Tumbuhan
    static class Mawar extends Tumbuhan {
        void duri() {
            System.out.println("Mawar berduri");
        }
    }

    //membuat main class
    static class Main {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Tumbuhan melati = new Tumbuhan();
            Mawar mawar = new Mawar();
            Tumbuhan miripmawar = new Mawar();

            melati.duri();
            mawar.duri();
            miripmawar.duri();
            miripmawar.makan();


        }

    }
}
