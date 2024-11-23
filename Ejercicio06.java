package Clase03_04;

import java.util.Scanner;

/*
Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        var num = scanner.nextInt();

        if (num % 2 == 0 && num % 7 == 0) {
            System.out.println("El número "+num+" es divisible por 2 y por 7.");
        } else {
            System.out.println("El número "+num+" no es divisible por 2 y 7. Intente con otro número.");
        }
        scanner.close();
    }
}
