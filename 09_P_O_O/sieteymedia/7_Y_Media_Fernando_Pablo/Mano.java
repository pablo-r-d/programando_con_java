/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class Mano {

  private float puntuacion = 0;
  private Carta[] mano = new Carta[15];

  // Métodos
  public void meterCarta(int ronda, Carta carta) {
    mano[ronda] = carta;
  }

  public void puntuacion(Carta carta) {
    puntuacion += carta.getValor();
  }

  public void mostrarMano() {
    for (Carta carta : mano) {
      if (carta != null) {

        switch (carta.getNumero()) {
          case 8:
            Interfaz.escribirDeFormaLenta("sota");
            break;
          case 9:
            Interfaz.escribirDeFormaLenta("caballo");
            break;
          case 10:
            Interfaz.escribirDeFormaLenta("rey");
            break;
          default:
            System.out.print(carta.getNumero());
            break;
        }
        Interfaz.escribirDeFormaLenta(" de " + carta.getPalo()+"\n");
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
