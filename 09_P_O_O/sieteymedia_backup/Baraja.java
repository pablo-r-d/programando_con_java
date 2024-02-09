/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz Fernando Sanchez
 */

public class Baraja {
  
  private Carta[][] baraja = new Carta[4][10];
  private Carta[] barajada = new Carta[40];

  ///// Metodos

  public void iniciarBaraja() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        baraja[i][j] = new Carta(j + 1, i);

      }
    }
  }

  public void mostrarBaraja() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        if (baraja[i][j].getNumero() < 8) {
          System.out.println(baraja[i][j].getNumero() + " " + baraja[i][j].getValor() + " " + baraja[i][j].getPalo());
        } else {
          switch (baraja[i][j].getNumero()) {
            case 8:
              System.out.print("sota ");
              break;
            case 9:
              System.out.print("caballo ");
              break;
            case 10:
              System.out.print("rey ");
              break;
          }
          System.out.println(baraja[i][j].getValor() + " " + baraja[i][j].getPalo());
        }

      }
    }
  }

  public void barajarBaraja() {
    int num;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        num = (int) (Math.random() * 40);
        if (barajada[num] == null) {
          barajada[num] = baraja[i][j];
        } else {
          num = 0;
          while (!(barajada[num] == null)) {
            num++;
          }
          barajada[num] = baraja[i][j];
        }
      }
    }
  }

  public void mostrarBarajada() {
    for (int i = 0; i < barajada.length; i++) {
      if (barajada[i].getNumero() < 8) {
        System.out.println(barajada[i].getNumero() + " " + barajada[i].getValor() + " " + barajada[i].getPalo());
      } else {
        switch (barajada[i].getNumero()) {
          case 8:
            System.out.print("sota ");
            break;
          case 9:
            System.out.print("caballo ");
            break;
          case 10:
            System.out.print("rey ");
            break;
        }
        System.out.println(barajada[i].getValor() + " " + barajada[i].getPalo());
      }
    }
  }

  public Carta sacarCarta(int ronda){
    return barajada[ronda];
  }

  public void vaciarBaraja() {
    for (int i = 0; i < barajada.length; i++) {
      barajada[i] = null;
    }
  }
}