/**
 * Clase de ejemplo Coche
 * 
 * @author Pablo Ruiz
 */

public class Coche extends Vehiculo {

  // Atributos o Propiedades
  private String matricula;
  private String marca;
  private String modelo;

  public Coche(String matricula, String marca, String modelo) {
    super();
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
  }

  public void quemaRueda() {
    System.out.println("Quemando rueda");
  }

}