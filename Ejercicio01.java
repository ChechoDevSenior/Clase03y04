package Clase03_04;

import java.util.Scanner;
/*
 Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese un número: ");    
        var numero = scanner.nextInt();

        if (numero > 0 ) {
            System.out.println("El número es positivo.");
        } else if (numero < 0 ) {
            System.out.println("El número es negativo.");
          } else {
            System.out.println("El número es cero.");
          }  
          System.out.println("Fin.");
          scanner.close();

    }
}
