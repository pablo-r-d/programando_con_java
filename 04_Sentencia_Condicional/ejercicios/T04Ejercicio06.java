/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T04Ejercicio06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    final double G = 9.81;
    System.out.print("Introduzca una altura (m) para calcular cuánto tardaría un objeto en caer desde la misma: ");
    double h = sc.nextDouble();

    double t = Math.pow(2*h/G, 0.5);

    if (h <= 0) {
      System.out.println("Ha introducido una altura no válida");
    } else {
      System.out.printf("El tiempo de caída será: %.2f segundos", t);
    }

    sc.close();
  }

}