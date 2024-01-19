/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Baraja {

  String[] palo = { "Bastos", "Copas", "Espadas", "Oro" };
  int numeroDeCartas = 40;
  Carta[][] baraja = new Carta[4][10]; // Array 4 palos 10 cartas por palo

  // Métodos

  public Baraja() {

    for (int i = 0; i < baraja.length; i++) {
      for (int j = 0; j < baraja[i].length; j++) {
        baraja[i][j] = new Carta((j + 1), palo[i]);
      }

    }
  }

  public String[] getPalo() {
    return palo;
  }

  public void setPalo(String[] palo) {
    this.palo = palo;
  }

  public int getNumeroDeCartas() {
    return numeroDeCartas;
  }

  public void setNumeroDeCartas(int numeroDeCartas) {
    this.numeroDeCartas = numeroDeCartas;
  }

  public Carta[][] getBaraja() {
    return baraja;
  }

  public void setBaraja(Carta[][] baraja) {
    this.baraja = baraja;
  }

  //Getter
  


}