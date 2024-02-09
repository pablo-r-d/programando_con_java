/**
 * Clase estudiante que hereda de la clase Persona
 * 
 * @author Pablo Ruiz
 */
public class Estudiante extends Persona {

  @Override
  public String toString() {
    return super.toString() + "\t[Estudiante] Créditos: " + creditos;
  }

  // Atributos
  private int creditos;

  // Constructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return this.creditos;
  }

  // @Override
  // public void mostrarDatos() {
  // super.mostrarDatos(); // Esta línea llama al método mostrar datos de la
  // superclase Persona
  // System.out.println("Estudiante matriculado de " + creditos +" créditos");
  // }

}