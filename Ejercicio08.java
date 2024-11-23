package Clase03_04;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese su edad: ");
        var edad = scanner.nextInt();

        if (edad<0) {
            System.out.println("Es una edad invalida.");
        } else if (edad <= 5) {
            System.out.println("Pertenece a la primera infancia.");
        } else if (edad <=11) {
            System.out.println("Pertenece a la infancia.");
        } else if (edad <=18) {
            System.out.println("Pertenece a la adolescencia.");
        } else if (edad <=26) {
            System.out.println("Pertenece a la juventd.");
        } else {if (edad <=59) {
            System.out.println("Pertenece a la adultez.");
            } else {
                System.out.println("Es persona mayor.");
                   }
        }    
        scanner.close(); 
    }
}
