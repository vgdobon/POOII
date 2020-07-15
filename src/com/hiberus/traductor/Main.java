package com.hiberus.traductor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Traductor nuevaTraduccion = new Traductor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que palabra quieres traducir");
        String palabraABuscar = sc.nextLine();

        nuevaTraduccion.Buscar(palabraABuscar);



    }
}
