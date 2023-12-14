/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class NumeroPrimoConFuncion {

  // Funciones definidas por el usuario
  public static boolean esPrimo(int x) { // Los nombres de las funciones siguen lowerCamelCase

    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    System.out.print("Introduce un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());

    if (esPrimo(num)) {
      System.out.println("El número " + num + " es primo.");
    } else {
      System.out.println("El número " + num + " no es primo.");
    }
  }

}
