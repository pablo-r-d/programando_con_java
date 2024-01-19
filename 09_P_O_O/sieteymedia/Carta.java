/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Carta {

  // Atributos
  int numero;
  String palo;
  double valor;

  // Constructor
  public Carta (int num, String pal) {
    this.numero = num;
    this.palo = pal;
  }

  // Getters
  public int getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  public double puntuacionCarta(int j) {

    // if (numero < 8) {
    //   valor = numero;
    // } else {
    //   valor = 0.5;
    // }
    // Es lo mismo pero en una línea y esta mas guapo
    return j<7?j+1:0.5;
  }

  // Setters
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  // Métodos

}