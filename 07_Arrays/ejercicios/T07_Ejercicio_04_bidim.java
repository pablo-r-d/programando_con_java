/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejercicio_04_bidim {

  public static void main(String[] args) throws InterruptedException {

    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    // Rellenar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int) (Math.random() * 900 + 100);
      }
    }

    // Mostramos el array
    int sumaFila;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila += tabla[fila][columna];
      }
      Thread.sleep(1000);
      System.out.printf("|%8d", sumaFila);
      System.out.println();
    }

    // Muestra las sumas parciales de las columnas
    for (columna = 0; columna < 49; columna++) {
      System.out.print("-");
    }
    System.out.println();

    int sumaColumna;
    int sumaTotal = 0;
    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      Thread.sleep(1000);
      System.out.printf("%8d", sumaColumna);
      Thread.sleep(1000);
      sumaTotal += sumaColumna;
    }
    System.out.printf("|%8d", sumaTotal);

  }

}