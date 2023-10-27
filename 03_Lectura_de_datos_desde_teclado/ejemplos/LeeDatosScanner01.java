/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

/**
 * LeeDatosScanner01
 */

import java.util.Scanner;
public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252"); //Creamos un objeto de la clase scanner llamado sc

    System.out.println("Introduce tu nombre: "); //Guardamos en la variable nombre lo que introducimos por teclado
    String nombre = sc.nextLine();

    System.out.println("Introduce tu edad: "); //Guardamos en la variable edad lo que introducimos por teclado
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
    sc.close();
  }
  
}