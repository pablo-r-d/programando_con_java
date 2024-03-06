package clases;
/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

public abstract class Mascota implements MascotaInterface {

  protected String chip;
  protected String nombre;
  protected int edad;
  protected boolean vacunada = false;
  protected static int totalMascotas;

  public static int getTotalMascotas() {
    return totalMascotas;
  }

  public String getNombre() {
    return nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }

  public void vacunar() {
    this.vacunada = true;
  }

  public String getChip() {
    return chip;
  }

}
