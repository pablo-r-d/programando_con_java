/** 
 * Lectura de datos por teclado usando Scanner y .next()
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;

public class LeeDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Creamos un objeto de la clase Scanner, llamado sc

    System.out.println("Introduce tu nombre y tu edad (separados por un espacio): ");
    String nombre = sc.next();
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
    sc.close(); // Cerramos el buffer para evitar warning

  }
}
