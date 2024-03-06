/**
 * Clase baraja
 * 
 * @author Pablo Ruiz Fernando Sanchez
 */

public abstract class Baraja {

  private static Carta[][] baraja = new Carta[4][10];
  private static Carta[] barajada = new Carta[40];

  // Métodos
  // Creamos 40 cartas en un array bidimensional
  // 4 filas para los palos y 10 columnas para las cartas de cada palo
  public static void iniciarBaraja() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        baraja[i][j] = new Carta(j + 1, i);

      }
    }
  }
  // Este método lo utilizamos para comprobar que la baraja fuese correcta
  // No tiene uso en el juego
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

  // Recorre el array bidimensional y guarda la carta en una posición aleatoria de un
  // array monodimensional, del cual se irán sacando cartas para jugar
  public static  void barajarBaraja() {
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

  // Este método lo utilizamos para comprobar que la baraja barajada fuese correcta
  // No tiene uso en el juego
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

  public static Carta sacarCarta(int ronda) {
    return barajada[ronda];
  }

  public static void vaciarBaraja() {
    for (int i = 0; i < barajada.length; i++) {
      barajada[i] = null;
    }
  }
}