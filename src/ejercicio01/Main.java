package ejercicio01;

public class Main {
    public static void main(String[] args) {
        // Variables
        String pais = "Argentina";
        int edad = 30;
        double altura = 100.72;
        double precio = 5.00;
        long telefono = 3884452680l;
        double coseno = Math.cos(0.5);
        double n1 = 5;
        double n2 = 10;
        double n3 = 8;
        double n4 = 10;
        double n5 = 4;

        // Calcula el promedio
        double total = (n1+n2+n3+n4+n5)/5;
        
        System.out.println("Edad: " + edad);
        System.out.println("Pais: " + pais);
        System.out.println("Altura del Edificio es: " + altura + " metros");
        System.out.println("Precio: " + precio + " pesos");
        System.out.println("Telefono: " + telefono);
        System.out.println("El Coseno de 0.5 es: " + coseno);
        System.out.println("El promedio es: "+ total);
}
}
