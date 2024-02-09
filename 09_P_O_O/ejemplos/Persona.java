/**
 * Clase persona que nos permitirá reutilizarla para ver el concepto de herencia
 * en POO
 * 
 * @author Pablo Ruiz
 */
public class Persona {

  @Override
  public String toString() {
    return "Nombre=" + nombre + "\tDNI=" + dni + "\tEdad=" + edad;
  }

  // Atributos
  protected String nombre; // Protected permite que las subclases accedan a este atributo
  private String dni;
  private int edad;

  // Constructor
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }

  // Getters y Setters

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  // Métodos

  // public void mostrarDatos() {
  //   System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni);
  // }

}
