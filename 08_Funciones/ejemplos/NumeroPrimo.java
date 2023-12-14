/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class NumeroPrimo {

  public static void main(String[] args) {

    System.out.print("Introduce un numero entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        esPrimo = false;
      }
    }

    if (esPrimo) {
      System.out.println("El número " + num + " es primo.");
    } else {
      System.out.println("El número " + num + " no es primo.");
    }

  }

}