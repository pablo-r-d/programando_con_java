/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;

public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la nota del primer examen");
    double nota1 = sc.nextDouble();

    System.out.println("¿Qué nota media quieres sacar en el trimestre?");
    double media = sc.nextDouble();

    double nota2 = (media - (0.4*nota1))/0.6;

    System.out.printf("Para tener un " + media + " en el trimestre necesitas %.2f en el segundo examen", nota2);

    sc.close();
  }
}
