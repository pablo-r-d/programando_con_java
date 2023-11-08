/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T04Ejercicio02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.print("Introduce qué hora es: ");
    double hora = sc.nextDouble();
    
    if (hora >= 6 && hora <= 12) {
      System.out.println("¡Buenos días!");
    }

    if (hora >= 13 && hora <= 20) {
      System.out.println("¡Buenas tardes!");
    }

    if (hora >= 21 || hora <= 5) {
      System.out.println("¡Buenas noches!");
    }


    sc.close();
  }

}