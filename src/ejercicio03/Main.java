package ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // crea el objeto escaner con su variable (sc)
        Scanner sc = new Scanner(System.in);
        //variables
        int numero;
        int factorial = 1;
        int contador = 1;
        System.out.println("Ingresa un Numero entre 1 y 10");
        // lee el numero ingresado y lo guarda en la variable numero
        numero = sc.nextInt();
        //Verifica si el numero esta entre el 0 y 10
        if (numero >= 0 && numero <= 10){
        while (contador <= numero){
            factorial = factorial * contador;
            contador ++;
        }
        System.out.println("El numero factorial de: " + numero + " es " + factorial);
        } else {
            //mensaje si ingresa un numero fuera de rango
         System.out.println("El numero esta Fuera de rango");
        
        }
    }
}
