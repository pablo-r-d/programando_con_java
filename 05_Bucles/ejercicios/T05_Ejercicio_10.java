/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T05_Ejercicio_10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.print("Introduce varios números para calcular la media.");
    System.out.println("Cuando quieras salir, introduce un número negativo.");
    
    double n = 1;
    double media = 0;
    double suma = 0;
    int i = 0;

    while (n >= 0) {
      System.out.println("Introduce un número:");
      n = sc.nextDouble();
    
      if (n > 0) {
        suma += n;
        i++;
      }
    }

    media = suma/i;

    System.out.println("La media es: " + media);

    sc.close();
  }

}
