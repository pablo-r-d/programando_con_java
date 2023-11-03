import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    
    System.out.println("Vamos a calcular el área de un rectángulo");
    
    System.out.println("Introduce su altura y su base:");
    float altura = sc.nextFloat();
    float base = sc.nextFloat();

    System.out.println("El área del rectángulo es: " + (base*altura));

    sc.close();
  }
}
