package ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables para almacenar el numero dado y el resultado
        int numero;
        int resultado;
        // crea el objeto escaner con su variable (sc)
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 al 9");
        // lee el numero ingresado y lo guarda en la variable numero
        numero = sc.nextInt();
        //estructura de repeticion hasta que el contador sea <= a 10
        for (int contador = 1; contador <= 10; contador++){
            resultado = numero * contador;
            System.out.println(numero + "x" + contador + " = " + resultado);
        }
    }
}
