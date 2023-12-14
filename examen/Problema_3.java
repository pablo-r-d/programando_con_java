/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Problema_3 {

  public static void main(String[] args) {

    int suma = 1;

    System.out.print("Introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());

    System.out.print("Los divisores propios de " + num + " son: ");
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        System.out.print(i + ", ");
        suma += i;
      }
    }
    System.out.println(); // Salto de línea

    System.out.println("Suma de los divisores propios y el 1: " + suma);

    if (suma == num) {
      System.out.println("Es un número perfecto.");
    } else {
      System.out.println("No es un número perfecto.");
    }

  }

}