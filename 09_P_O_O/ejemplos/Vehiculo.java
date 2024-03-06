/*
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public abstract class Vehiculo {

  // Atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales;

  // Atributos de instancia
  protected int kilometrosRecorridos;

  // Constructor
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    vehiculosCreados++;
  }

  public int getKiometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre(int km) {
    kilometrosRecorridos += km;
    kilometrosTotales += km;
  }

  // Método de clase
  public static int getKilometrosjeTotal() {
    return kilometrosTotales;
  }

}