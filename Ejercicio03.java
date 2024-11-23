package Clase03_04;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        var num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar."); 
        }
        scanner.close();
    }
    
}
