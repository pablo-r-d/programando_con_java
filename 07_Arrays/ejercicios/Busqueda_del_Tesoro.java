/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Busqueda_del_Tesoro {

  public static void main(String[] args) {

    // Constantes que representan las diferentes casillas
    // Las constantes van en mayúsculas
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;

    // Tablero de 4 filas y 5 columnas
    int[][] tablero = new int[4][5];

    // Inicializamos el tablero con casillas vacías
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA;
      }
    }

    // Se coloca una casilla de TESORO de manera aleatoria en el tablero
    int tesoroFila = (int) (Math.random() * 4); // Numero aleatorio entero [0,4)
    int tesoroColumna = (int) (Math.random() * 5); // Numero aleatorio entero [0,5)
    tablero[tesoroFila][tesoroColumna] = TESORO;

    // Se coloca una casilla de mina de manera aleatoria en el tablero
    // No puede ser la misma que la del tesoro
    int minaFila;
    int minaColumna;
    do {
      minaFila = (int) (Math.random() * 4);
      minaColumna = (int) (Math.random() * 5);
    } while ((tesoroFila == minaFila) && (tesoroColumna == minaColumna));
    tablero[minaFila][minaColumna] = MINA;

    // Iniciamos el juego
    System.out.println("JUEGO DEL TESORO");
    boolean salida = false;
    do {
      // Pintamos el tablero
      for (int i = (tablero.length - 1); i >= 0; i--) {
        System.out.println(i + " |");
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j] == JUGADA) {
            System.out.printf("%2s", "X");
          } else {
            System.out.printf("%2s", " ");
          }
        }
        // System.out.println();
        // for (int j = 0; j < tablero[i].length; j++) {
        // System.out.print("---");
        // }
        System.out.println();
        System.out.print("   ");
        for (int j = 0; j < (3 * tablero[0].length); j++) {
          System.out.print("-");
        }
        System.out.print("\n   ");
        for (int j = 0; j < tablero[0].length; j++) {
          System.out.printf("%2d", j);
        }
        System.out.println();

        // Pido las coordenadas
        System.out.print("Introduce fila: ");
        fila = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce columna: ");
        columna = Integer.parseInt(System.console().readLine());

        // Compruebo lo que hay en las coordenadas introdcidas por el jugador
        switch (tablero[fila][columna]) {
          case VACIA:
            tablero[fila][columna] = JUGADA;
            break;

          case MINA:
            System.out.println("BOOOM");
            salida = true;
            break;

          case TESORO:
            System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
            salida = true;
            break;

          default:
            break;
        }
      }
    } while (!salida);

    // Pintamos el tablero final una vez terminada la partida
    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
          default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3 * tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }

  }

}