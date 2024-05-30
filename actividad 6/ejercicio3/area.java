package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            
            System.out.println("Seleccione una figura geométrica a la cual quiere saber su area");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("introduce la base del triangulo");
        double baseTriangulo =  scanner.nextDouble();
        System.out.println("ingresa la altura del triangulo"); 
        double alturaTriangulo = scanner.nextDouble();
        double area =( baseTriangulo * alturaTriangulo) / 2;
        System.out.println("el area del triangulo es: " +area);

    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("ingresa el lado del cuadrado");
        double ladoCuadrado= scanner.nextDouble();
        double area = ladoCuadrado*ladoCuadrado;
        System.out.println("el area del cuadrado es " + area);
       
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("ingresa la base del rectangulo");
         double baseRetangulo = scanner.nextDouble();
        System.out.println("ingrese la altura del rectangulo");
        double alturaRectangulo = scanner.nextDouble();
        double area = baseRetangulo*alturaRectangulo;
        System.out.println("la area de rectangulo es "+ area);
        
    }

    private static void calcularCirculo(Scanner scanner) {
       System.out.println("ingresa el radio del circulo");
       double radioCirculo = scanner.nextDouble();
       double area = 3.1416*radioCirculo*radioCirculo;
       System.out.println("el area del circulo es " + area);

    }
}
    