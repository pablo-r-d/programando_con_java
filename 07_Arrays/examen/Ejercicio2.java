public class Ejercicio2 {

  // Función para generar una tabla con números aleatorios
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
    int[][] tablaAux = new int[filas][columnas];

    for (int i = 0; i < tablaAux.length; i++) {
      for (int j = 0; j < tablaAux.length; j++) {
        tablaAux[i][j] = (int) (Math.random() * (maxAleatorio + 1));
      }
    }

    return tablaAux;
  }

  // Función para generar una tabla introduciendp números manualmente
  public static int[][] generarTablaManual(int filas, int columnas) {
    int[][] tablaAux = new int[filas][columnas];

    for (int i = 0; i < tablaAux.length; i++) {
      for (int j = 0; j < tablaAux.length; j++) {
        System.out.print("Introduce el número que va en la fila " + (i + 1) + " columna " + (j + 1) + ": ");
        tablaAux[i][j] = Integer.parseInt(System.console().readLine());
      }
    }

    return tablaAux;
  }

  // Función para mostrar la tabla
  public static void mostrarTabla(int[][] tabla) {
    if (tabla == null) {
      System.out.println("Primero debe generar la tabla.");
      return;
    }

    for (int i = 0; i < tabla.length; i++) {
      System.out.print("| ");
      for (int is : tabla[i]) {
        System.out.printf("%2d | ", is);
      }
      System.out.println();
    }

  }

  // Función para intercambiar dos filas en la tabla
  public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
    int[] filaAux = new int[tabla[(fila1)].length];

    for (int i = 0; i < filaAux.length; i++) {
      filaAux[i] = tabla[(fila1 - 1)][i];
      tabla[(fila1 - 1)][i] = tabla[(fila2 - 1)][i];
    }

    for (int i = 0; i < filaAux.length; i++) {
      tabla[(fila2 - 1)][i] = filaAux[i];
    }

  }

  // Función para intercambiar dos columnas en la tabla
  public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {

    int[] colAux = new int[tabla.length];

    for (int i = 0; i < colAux.length; i++) {
      colAux[i] = tabla[i][(col1 - 1)];
      tabla[i][(col1 - 1)] = tabla[i][(col2 - 1)];
    }

    for (int i = 0; i < colAux.length; i++) {
      tabla[i][(col2 - 1)] = colAux[i];
    }

  }

  // Función para sumar los elementos de una fila
  public static int sumarFila(int[][] tabla, int fila) {
    int suma = 0;
    for (int i = 0; i < tabla[fila].length; i++) {
      suma += tabla[(fila - 1)][i];
    }
    return suma;
  }

  // // Función para sumar los elementos de una columna
  public static int sumarColumna(int[][] tabla, int col) {
    int suma = 0;
    for (int i = 0; i < tabla.length; i++) {
      suma += tabla[i][(col - 1)];
    }
    return suma;
  }

  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;
    int maxAleatorio;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:

          System.out.print("Introduce el número de filas de la tabla: ");
          filas = Integer.parseInt(System.console().readLine());

          System.out.print("Introduce el número de columnas de la tabla: ");
          columnas = Integer.parseInt(System.console().readLine());

          System.out.print("Introduce el número máximo que quieres que aparezca en la tabla: ");
          maxAleatorio = Integer.parseInt(System.console().readLine());

          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
          break;
        case 2:
          System.out.print("Introduce el número de filas de la tabla: ");
          filas = Integer.parseInt(System.console().readLine());

          System.out.print("Introduce el número de columnas de la tabla: ");
          columnas = Integer.parseInt(System.console().readLine());

          tabla = generarTablaManual(filas, columnas);
          break;
        case 3:

          mostrarTabla(tabla);

          break;
        case 4:
          System.out.print("Introduce el número de la primera fila que quieres intercambiar(1-" + tabla.length + "): ");
          fila1 = Integer.parseInt(System.console().readLine());

          System.out.print("Introduce el número de la segunda fila que quieres intercambiar(1-" + tabla.length + "): ");
          fila2 = Integer.parseInt(System.console().readLine());

          intercambiarFilas(tabla, fila1, fila2);
          break;
        case 5:

          System.out
              .print("Introduce el número de la primera columna que quieres intercambiar(1-" + tabla[0].length + "): ");
          col1 = Integer.parseInt(System.console().readLine());

          System.out
              .print("Introduce el número de la segunda columna que quieres intercambiar(1-" + tabla.length + "): ");
          col2 = Integer.parseInt(System.console().readLine());

          intercambiarColumnas(tabla, col1, col2);
          break;
        case 6:
          System.out.print("Introduce la fila cuyos elementos quieres sumar(1-" + tabla.length + "): ");
          filaSuma = Integer.parseInt(System.console().readLine());
          int sumaFila = sumarFila(tabla, filaSuma);
          System.out.println("La suma de los elementos de la fila " + filaSuma + " es: " + sumaFila);
          break;
        case 7:
          System.out.print("Introduce la columna cuyos elementos quieres sumar(1-" + tabla[0].length + "): ");
          colSuma = Integer.parseInt(System.console().readLine());
          int sumaCol = sumarColumna(tabla, colSuma);
          System.out.println("La suma de los elementos de la columna " + colSuma + " es: " + sumaCol);
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
