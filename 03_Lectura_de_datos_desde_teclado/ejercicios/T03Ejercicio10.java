/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cantidad de Mb para convertilo a Kb");
    float Mb = sc.nextFloat();

    System.out.println("La cantidad introducida equivale a " + Mb*1000 + " Kb");



    sc.close();
  }
}
