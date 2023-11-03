/** 
 * Volumen cono
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;
public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("Vamos a calcular el volumen de un cono: ");
    System.out.println("Introduce su altura");
    float h = sc.nextFloat();

    System.out.println("Introduce su radio");
    float r = sc.nextFloat();

    System.out.printf("El volumen del cono es %.2f unidades cúbicas", (r*r*h*3.1415/3));

    sc.close();
  }
}
