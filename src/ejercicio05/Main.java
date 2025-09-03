package ejercicio05;

import java.time.LocalDate;

import ejercicio05.model.Personas;

public class Main {
public static void main(String[] args) {

    // Llamar a la clase Personas
    // Persona 1
    Personas personaUno = new Personas();
    personaUno.setDni("37644641");
    personaUno.setNombre("Franco");
    personaUno.setFechaDeNacimiento(LocalDate.of(1994, 9, 16));
    personaUno.setProvincia("Jujuy");


    // Persona 2 con constructor parametrizado
    Personas personaDos = new Personas(
            "38963741", 
            "Mauro", 
            LocalDate.of(1991, 1, 16), 
            "Jujuy"
    );
    

    // Imprimir nombre y edad de cada persona
    System.out.println(personaUno.getNombre() + " tiene " + personaUno.calcularEdad() + " años.");

    //Otra forma de mostrar los datos con el Metodo creado
    personaDos.mostrarDatos();
}
}