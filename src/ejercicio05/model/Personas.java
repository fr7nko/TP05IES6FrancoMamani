package ejercicio05.model;
import java.time.LocalDate;
import java.time.Period;


public class Personas {
   
    // Atributos
    private String dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String provincia;

    // Constructor por defecto
    
    public Personas() {
    }
    

    // Contrustor Parametrizado
    
  public Personas(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.provincia = provincia;
    }

    // Metodos Accesores getters y setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


    // Metodos creados
    
    // Punto 1 Metodo para Calcular la edad
    public int calcularEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }
   
    // Punto 2 Metodo para saber si es mayor de edad
    public boolean mayorDeEdad() {
        return calcularEdad() >= 18;
    }

    // Punto 3 Metodo que muestra todos los datos de la persona
public void mostrarDatos() {
    System.out.println("DNI: " + dni);
    System.out.println("Nombre: " + nombre);
    System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
    System.out.println("Provincia: " + provincia);
    System.out.println("Edad: " + calcularEdad() + " años");
    
    if (mayorDeEdad()) {
        System.out.println("La persona es mayor de edad");
    } else {
        System.out.println("La persona no es mayor de edad");
    }
    
}

}
