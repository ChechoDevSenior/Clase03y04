package Clase03_04;

/*
 Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.
 */
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        var valor = scanner.nextLine();

        if (valor.length() == 1) {
            var letra = Character.toLowerCase(valor.charAt(0));
            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'||letra == 'u') {
                    System.out.println("La letra " + valor + " es vocal.");
                } else {
                    System.out.println("La letra " + valor + " es una consonante");
                }
            } else {
                System.out.println("El valor ingresado no es una letra.");
            }

        } else {
            System.out.println("Por favor ingresa un solo valor.");
        }
        scanner.close();
    }
}
