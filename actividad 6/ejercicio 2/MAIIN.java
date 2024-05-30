package com.MAIN;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           adivinarNumero(1, 100, 5);
    }

    
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        
        Random R = new Random();
        int valorAleatorio = R.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenidos a este juego de adivinar un numero");
        System.out.println("Introduce un numero  del 1 al 100");

        while (intentos < max_intentos) {
            int numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == valorAleatorio) {
                System.out.println("bien hecho, ese era  el numero y tus intentos fueron " + intentos);
                return;
            }

            if (numeroUsuario < valorAleatorio) {
                System.out.println("el numero aleatorio es mayor a " + numeroUsuario);
                System.out.println("intenta otra vez");
            } else {
                System.out.println("el numero aletorio es menor a " + numeroUsuario);
                System.out.println("intenta otra vez");

            }
       }
    System.out.println("fin del juego");
    System.out.println("mala suerte amigo, perdiste el numero aleatorio era " + valorAleatorio);

    }
}