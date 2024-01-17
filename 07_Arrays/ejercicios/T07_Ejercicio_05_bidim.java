/**
 * Ordena de menor a mayor y viceversa los números introducidos en un array.
 * En lugar de números introducidos por teclado utilicé números aleatorios
 * 
 * @author Pablo Ruiz
 */

public class T07_Ejercicio_05_bidim {

  public static void main(String[] args) {

    int[][] tabla = new int[6][10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int fila;
    int columna;
    int filaMax = 0;
    int columnaMax = 0;
    int filaMin = 0;
    int columnaMin = 0;

    System.out.println();
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int) (Math.random() * 1001);

        if (tabla[fila][columna] > max) {
          max = tabla[fila][columna];
          filaMax = fila;
          columnaMax = columna;
        } else if (tabla[fila][columna] < min) {
          min = tabla[fila][columna];
          filaMin = fila;
          columnaMin = columna;
        }
      }
    }

    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        if (tabla[fila][columna] == max) {
          System.out.printf("\033[33m%8d\033[0m", tabla[fila][columna]);
        } else if (tabla[fila][columna] == min) {
          System.out.printf("\033[36m%8d\033[0m", tabla[fila][columna]);
        } else {
          System.out.printf("%8d", tabla[fila][columna]);
        }

      }
      System.out.println();
    }

    System.out.println();
    System.out.println(
        "El número máximo es " + max + ". Se encuentra en la fila " + (filaMax + 1) + " columna " + (columnaMax + 1));
    System.out.println(
        "El número mínimo es " + min + ". Se encuentra en la fila " + (filaMin + 1) + " columna " + (columnaMin + 1));
    System.out.println();

  }

}