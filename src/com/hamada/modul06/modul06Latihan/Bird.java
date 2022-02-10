package com.hamada.modul06.modul06Latihan;

public class Bird extends Animal {
    public Bird() {

    }

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(this.name + " flies");
        System.out.println();
    }
}
