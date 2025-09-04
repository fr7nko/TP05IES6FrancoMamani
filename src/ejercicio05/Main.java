package ejercicio05;
import java.time.LocalDate;
import ejercicio05.model.Personas;

public class Main {
public static void main(String[] args) {

        
   
    // Carga de datos 
    // Persona 1 con el constructor por defecto
    Personas personaUno = new Personas();
    personaUno.setDni("37644641");
    personaUno.setNombre("Franco");
    personaUno.setFechaDeNacimiento(LocalDate.of(1994, 9, 16));
    personaUno.setProvincia("Jujuy");


    // Persona 2 con el constructor parametrizado
    Personas personaDos = new Personas(
            "38963741", 
            "Mauro", 
            LocalDate.of(1991, 1, 16), 
            "Jujuy"
    );
    
    // Persona 3 con constructor parametrizado
    Personas personaTres = new Personas(
            "32159753", 
            "Vicente", 
            LocalDate.of(2009, 1, 13)
           
    );
    
    //Mostrar los datos con el Metodo creado para saber si es mayor de edad
        personaUno.mostrarDatos();
        System.out.println("---------------");
        personaDos.mostrarDatos();
        System.out.println("---------------");
        personaTres.mostrarDatos();
     System.out.println(personaDos.mayorDeEdad());
}
}