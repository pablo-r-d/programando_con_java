/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class Mano {

  private float puntuacion = 0;
  private Carta[] mano = new Carta[15];

  // Metodo robar carta
  public void meterCarta(int ronda, Carta carta) {
    mano[ronda] = carta;
  }

  // Metodo puntuacion
  public void puntuacion(Carta carta) {
    puntuacion += carta.getValor();
  }

  // Metodo mostrar mano
  public void mostrarMano() {
    for (Carta carta : mano) {
      if (carta != null) {

        switch (carta.getNumero()) {
          case 8:
            System.out.print("sota");
            break;
          case 9:
            System.out.print("caballo");
            break;
          case 10:
            System.out.print("rey");
            break;
          default:
            System.out.print(carta.getNumero());
            break;
        }
        System.out.println(" de " + carta.getPalo());
      }
    }
  }

  public void vaciarMano() {
    for (int i = 0; i < mano.length; i++) {
      mano[i] = null;
    }
  }

  public float getPuntuacion() {
    return puntuacion;
  }

  public Carta[] getMano() {
    return mano;
  }

  public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
  }

}
