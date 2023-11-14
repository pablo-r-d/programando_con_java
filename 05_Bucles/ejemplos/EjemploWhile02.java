/** 
 * Contador de números positivos y negativos introducidos por teclado
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;
public class EjemploWhile02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    String answer = "s";
    int i = 0;
    int j = 0;

    System.out.println("Introduce un número por teclado");

    while (answer.equals("s")) {
      int num = sc.nextInt();
      
      if (num > 0) {
        i++;
      } else if (num < 0) {
          j++;
      }
     
      System.out.println("¿Quieres introducir otro número?(s/n)");
      answer = sc.next().toLowerCase();
    }

    System.out.println("Ha introducido un total de  " + i + " números positivos.");
    System.out.println("Ha introducido un total de  " + j + " números negativos.");

    sc.close();
  }

}