/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class Jugador {
  private int monedero;
  private int apuesta;

  // Metodo realizar apuesta
  public int apuesta() {
    do { // Bucle para asegurar que la cantidad es correcta
      System.out.println("¿Cuánto dinero quiere apostar? ");
      System.out.print(" $");
      apuesta = Integer.parseInt(System.console().readLine());
      if (apuesta > monedero) {
        System.out.println("No puede apostar más de $" + monedero);
      } else if (apuesta < 1) {
        System.out.println("La apuesta minima es 1");
      }
      System.out.println();
    } while (apuesta > monedero || apuesta < 1);
    return apuesta;
  }

  public int getMonedero() {
    return monedero;
  }

  public int getApuesta() {
    return apuesta;
  }

  public void setMonedero(int monedero) {
    this.monedero = monedero;
  }

  public void setApuesta(int apuesta) {
    this.apuesta = apuesta;
  }

}