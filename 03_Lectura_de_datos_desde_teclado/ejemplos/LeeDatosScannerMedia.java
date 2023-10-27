/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;

public class LeeDatosScannerMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tres números cualquiera, separados por espacio, para calcular su media: ");
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    float num3 = sc.nextFloat();
    sc.close();

    System.out.println("Los números son " + num1 + " - " + num2 + " - " + num3 + " y su media es: " + ((num1+num2+num3)/3));
  }

  
}
