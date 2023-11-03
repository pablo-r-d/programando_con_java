import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("Vamos a calcular el área de un triángulo");
    
    System.out.println("Introduce su altura y su base:");
    float altura = sc.nextFloat();
    float base = sc.nextFloat();

    System.out.println("El área del triángulo es: " + (base*altura)/2);

    sc.close();
  }
}
