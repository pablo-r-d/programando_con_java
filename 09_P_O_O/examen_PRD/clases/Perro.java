package clases;
/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

public class Perro extends Mascota {

  private String raza;
  private static int totalPerros = 0;

  // Constructores
  public Perro(String chip) {
    this.chip = chip;
    // this.edad;
    totalPerros++;
    totalMascotas++;
  }

  public Perro(String chip, String nombre) {
    this.chip = chip;
    this.nombre = nombre;
    totalPerros++;
    totalMascotas++;
  }

  // Métodos

  public void ladrar() {
    System.out.println("¡Guau! ¡Guau!");
  }

  public void grunir() {
    System.out.println("Grrr...");
  }

  @Override
  public void pasear() {
    if (!vacunada) {
      System.out.println(this.nombre + " no puede pasear hasta no ser vacunado/a.");
    } else {
      ladrar();
    }
  }

  @Override
  public void vacunar() {
    if (vacunada) {
      System.out.println(this.nombre + " se encuentra vacunado/a");
    } else {
      // vacunar().super(); No me acuerdo cómo era
      this.vacunada = true; // Aquí tengo que implementar el metodo de la clase padre
      grunir();
    }
  }

  public static int getTotalPerros() {
    return totalPerros;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getRaza() {
    return raza;
  }

}
