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

    // Persona 2
    Personas personaDos = new Personas();
    personaDos.setDni("42135678");
    personaDos.setNombre("Matías");
    personaDos.setFechaDeNacimiento(LocalDate.of(1996, 3, 25));
    personaDos.setProvincia("Salta");

    // Persona 3
    Personas personaTres = new Personas();
    personaTres.setDni("39876543");
    personaTres.setNombre("Geovana");
    personaTres.setFechaDeNacimiento(LocalDate.of(1995, 12, 10));
    personaTres.setProvincia("Jujuy");

    // Persona 4
    Personas personaCuatro = new Personas();
    personaCuatro.setDni("41234567");
    personaCuatro.setNombre("Camila M.");
    personaCuatro.setFechaDeNacimiento(LocalDate.of(1997, 7, 5));
    personaCuatro.setProvincia("Tucumán");

    // Persona 5
    Personas personaCinco = new Personas();
    personaCinco.setDni("38765432");
    personaCinco.setNombre("Francisco");
    personaCinco.setFechaDeNacimiento(LocalDate.of(2023, 11, 30));
    personaCinco.setProvincia("Salta");
    
    // Persona 6 con constructor parametrizado
    Personas personaSeis = new Personas(
            "38963741", 
            "Mauro", 
            LocalDate.of(1991, 1, 16), 
            "Jujuy"
    );
    

    // Imprimir nombre y edad de cada persona
    System.out.println(personaUno.getNombre() + " tiene " + personaUno.calcularEdad() + " años.");

    //Otra forma de mostrar los datos con el Metodo creado
    personaSeis.mostrarDatos();
}
}