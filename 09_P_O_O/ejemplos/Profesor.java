/**
 * Hereda de Persona
 * 
 * @author Pablo Ruiz
 */
public class Profesor extends Persona {

  @Override
  public String toString() {
    return super.toString() + "\t[Profesor] Departamento: " + departamento + "\t Sueldo=" + sueldo;
  }

  // Atributos
  private String departamento;
  private double sueldo;

  // Constructores
  public Profesor(String nombre, int edad, String dni, String departamento, double sueldo) {
    super(nombre, edad, dni);
    this.departamento = departamento;
    this.sueldo = sueldo;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

}