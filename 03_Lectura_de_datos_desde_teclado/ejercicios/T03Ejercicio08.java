/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("Vamos a calcular el salario semanal en función de las horas trabajadas.");
    System.out.println("Introduce las horas que correspondan");
    float horas = sc.nextFloat();

    float sueldo = 12 * horas;

    System.out.println("Tu sueldo semanal es: " + sueldo + "€");

    sc.close();
  }
}
