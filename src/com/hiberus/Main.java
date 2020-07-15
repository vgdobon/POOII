package com.hiberus;

public class Main {
    public static void main(String[] args) {
        Dog milu=new Dog();
        milu.name="milu";
        milu.years=1;

        milu.years++;

        Dog lassie = new Dog();
        lassie.name="lassie";
        lassie.years=4;

        Cat gatoConBotas = new Cat();
        gatoConBotas.name="Gato con Botas";

        System.out.println("Vidas de "+gatoConBotas.name+", y tiene "+gatoConBotas.vidas);

        gatoConBotas.die();
        gatoConBotas.die();
        gatoConBotas.die();
        gatoConBotas.die();
        gatoConBotas.die();
        gatoConBotas.die();
        gatoConBotas.die();
        gatoConBotas.die();

        System.out.println("Vidas de "+gatoConBotas.name+", y tiene "+gatoConBotas.vidas);

        System.out.println(milu.name +","+lassie.name+","+gatoConBotas.name);
    }
}
