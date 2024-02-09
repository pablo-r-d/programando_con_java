/**
 * Clase que contiene el método main para probar la herencia
 * 
 * @author Pablo Ruiz
 */
public class AppPersonaEstudiante {

  public static void main(String[] args) {

    Persona p = new Persona("Pepe Rodríguez", 30, "12345678A");
    Estudiante e = new Estudiante("Paula Gómez", 21, "23456789O");
    Profesor prof = new Profesor("Sergio Sánchez", 34, "12345676567", "Informática", 10000);

    // p.mostrarDatos();
    // e.mostrarDatos();

    System.out.println(p.toString());
    System.out.println(p);
    System.out.println(e.toString());
    System.out.println(e);
    System.out.println(prof.toString());
    System.out.println(prof);

    


  }

}