package Clase03_04;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
         Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y compruebe si con estos números se puede formar un triángulo.
         */
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese el valor del primer lado: ");
        var lado1= scanner.nextInt();
        System.out.print("Ingrese el valor del segundo lado: ");
        var lado2= scanner.nextInt();
        System.out.print("Ingrese el valor del tercer lado: ");
        var lado3= scanner.nextInt();
        if (lado1+lado2 > lado3 && lado1+lado3 > lado2 && lado2+lado3 > lado1) {
            System.out.println("Con esas medidas si se puede formar un triangulo.");
        } else {
           System.out.println("Con estos lados NO se puede formar un triangulo."); 
           System.out.println("Intente con otros valores. ");
        }
        scanner.close();
    }
}
