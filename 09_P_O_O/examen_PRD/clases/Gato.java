package clases;
/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

public class Gato extends Mascota {

  private String pelaje;
  private static int totalGatos;

  public String getPelaje() {
    return pelaje;
  }

  public static int getTotalGatos() {
    return totalGatos;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

  // Constructores
  public Gato(String chip) {
    this.chip = chip;
    totalGatos++;
    totalMascotas++;
  }

  public Gato(String chip, String nombre) {
    this.chip = chip;
    this.nombre = nombre;
    totalGatos++;
    totalMascotas++;
  }

  // Métodos

  public void maullar() {
    System.out.println("¡Miau! Brrr...");
  }

  public void bufar() {
    System.out.println("Fuuu...");
  }

  @Override
  public void pasear() {
    if (!vacunada) {
      System.out.println(this.nombre + " no puede pasear hasta no ser vacunado/a.");
    } else {
      maullar();
    }
  }

  @Override
  public void vacunar() {
    if (vacunada) {
      System.out.println(this.nombre + " se encuentra vacunado/a");
    } else {
      // vacunar().super(); No me acuerdo cómo era
      this.vacunada = true; // Aquí tengo que implementar el metodo de la clase padre
      bufar();
    }
  }

}
