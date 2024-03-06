/**
 * Clase jugador
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class Jugador {
  private int monedero;
  private int apuesta;

  // Método realizar apuesta
  public int apuesta() {
    do { // Bucle para asegurar que la cantidad es correcta
      Interfaz.escribirDeFormaLenta("¿Cuánto dinero quieres apostar? ");
      System.out.print(" $");
      apuesta = Integer.parseInt(System.console().readLine());
      if (apuesta > monedero) {
        System.out.println("No puedes apostar más de $" + monedero);
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