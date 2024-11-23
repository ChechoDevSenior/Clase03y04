package Clase03_04;

import java.util.Scanner;

/*
 Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        var num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        var num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        var num3 = scanner.nextInt();
        int mayor;
        if (num1 > num2) {
            if (num1 > num3) {
                mayor = num1;
            } else {
                mayor = num3;
            }
        } else if (num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);

        scanner.close();

    }
}
