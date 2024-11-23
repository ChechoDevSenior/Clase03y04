package Clase03_04;

import java.util.Scanner;

/*
 Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        var valor = scanner.nextLine();

        if (valor.length() == 1) {
            var letra = valor.charAt(0);
            if (Character.isUpperCase(letra)) {
                System.out.println("La letra " + letra + " es mayúscula.");
            } else if (Character.isLowerCase(letra)) {
                System.out.println("La letra " + letra + " es minúscula.");
            } else {
                System.out.println("El valor ingresado no es una letra.");
            }

        } else {
            System.out.println("Por favor ingresa un solo valor.");
        }
        scanner.close();
    }
}
