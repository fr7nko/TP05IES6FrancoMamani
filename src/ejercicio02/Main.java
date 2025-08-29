package ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // crea el objeto escaner con su variable (sc)
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese un Numero: ");
        // lee el numero ingresado y lo guarda en la variable n1
        int n1 = sc.nextInt();                      
        if (n1 % 2 == 0) {
            System.out.println("El numero es par y su triple es: " + n1 * 3);
        } else {
            System.out.println("El numero es impar y su doble es: " + n1 * 2);

            
        }
    }
}
