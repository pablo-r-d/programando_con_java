package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Sergio Sánchez
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code>
   *         en caso contrario
   */
  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  /**
   * Calcula la media de varios números introducidos por teclado.
   * Pregunta primero si sabes cuántos números vas a introducir.
   * 
   * @param num
   * @return double
   */
  public static double media() {
    String repetir = "s";
    double media;
    double suma = 0;
    int i = 0;
    double num;

    System.out.println("¿Sabes cuántos números vas a introducir?(s/n)");
    String sabe = System.console().readLine().toLowerCase();

    if (sabe.equals("s")) {
      System.out.println("¿Cuántos números quieres introducir?");
      i = Integer.parseInt(System.console().readLine());
      for (int j = 0; j < i; j++) {
        System.out.print("Introduce un número: ");
        num = Double.parseDouble(System.console().readLine());

        suma += num;
      }
    } else {
      while (repetir.equals("s")) {

        System.out.print("Introduce un número: ");
        num = Double.parseDouble(System.console().readLine());

        suma += num;
        i++;

        System.out.println("¿Quieres introducir otro número?)(s/n)");
        repetir = System.console().readLine().toLowerCase();
      }
    }

    media = suma / i;
    return media;
  }

  /**
   * Voltea un número introducido por teclado.
   * 
   * @param num
   * @return long
   */
  public static long voltear(long num) {

    long numeroVolteado = 0;
    System.out.println("Esta es la función que devuelve un long.");

    if (num < 0) {
      return -voltear(-num); // No hace falta multiplicar por -1, con poner - funciona.
    }

    while (num > 0) {
      numeroVolteado = (numeroVolteado * 10) + (num % 10);
      num /= 10;
    }
    return numeroVolteado;
  }

  /**
   * Voltea un número introducido por teclado.
   * 
   * @param num
   * @return int
   */
  public static int voltear(int num) {
    System.out.println("Esta es la función que devuelve un int.");
    return (int) (voltear((long) num));
  }

  /**
   * @param num
   * @return boolean
   */
  public static boolean esCapicua(long num) {
    return num == voltear(num);
  }

  /**
   * @param num
   * @return int
   */
  public static int siguientePrimo(int num) {
    while (!esPrimo(++num))
      ; // ! niega el valor de retorno de esPrimo, que es un boolean
        // ++num es un preincremento, para que sume 1 a la variable antes de ejecutar la
        // función
    return num;
  }

  /**
   * Devuelve un array de enteros unidimensional ordenado de menor a mayor
   * 
   * @param num
   * @return int
   */
  public static int[] menorMayor(int[] num) {

    for (int j = 0; j < (num.length - 1); j++) {
      for (int i = 0; i < (num.length - 1); i++) {
        if (num[i] > num[(i + 1)]) {
          int numero = num[i];
          num[i] = num[(i + 1)];
          num[(i + 1)] = numero;
        }
      }
    }

    return num;

  }

  /**
   * Devuelve un array de enteros unidimensional ordenado de mayor a menor
   * 
   * @param num
   * @return int
   */
  public static int[] mayorMenor(int[] num) {

    for (int j = 0; j < (num.length - 1); j++) {
      for (int i = 0; i < (num.length - 1); i++) {
        if (num[i] < num[(i + 1)]) {
          int numero = num[i];
          num[i] = num[(i + 1)];
          num[(i + 1)] = numero;
        }
      }
    }

    return num;

  }

}