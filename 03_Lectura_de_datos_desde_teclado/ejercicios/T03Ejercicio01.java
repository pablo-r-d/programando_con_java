import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T03Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");

    System.out.println("Introduce un número: "); 
    float num1 = sc.nextFloat();

    System.out.println("Introduce otro número: "); 
    float num2 = sc.nextFloat();

    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual a " + (num1*num2));
    sc.close();
  }
}
