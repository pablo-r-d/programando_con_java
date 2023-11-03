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
    float nota1 = sc.nextFloat();

    System.out.println("¿Qué nota media quieres sacar en el trimestre?");
    float media = sc.nextFloat();

    float nota2 = (2*media) - nota1;

    System.out.printf("Para tener un " + media + " en el trimestre necesitas %.2f en el segundo examen", nota2);

    sc.close();
  }
}
