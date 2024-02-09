/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class Carta {
  private int numero;
  private double valor;
  private String palo;

  // Constructores
  Carta(int numero, int palo) {
    this.numero = numero;
    if (numero <= 7) {
      this.valor = numero;
    } else {
      this.valor = 0.5;
    }

    switch (palo) {
      case 0:
        this.palo = "bastos";
        break;

      case 1:
        this.palo = "espadas";
        break;

      case 2:
        this.palo = "copas";
        break;

      case 3:
        this.palo = "oro";
        break;

      default:
        break;
    }
  }

  // Getters
  public int getNumero() {
    return numero;
  }

  public double getValor() {
    return valor;
  }

  public String getPalo() {
    return palo;
  }

}