package com.hiberus;

public class Cat {
    String name;
    int vidas;

    public Cat(){
        vidas=7;
    }

    public void die(){
        if(vidas>0){
            vidas--;
        }else{
            System.out.println("He muerto!");
        }
    }
}
