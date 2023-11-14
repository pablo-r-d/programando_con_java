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
    int suma = 0; // Acumula los números positivos introducidos
    int sumaNeg = 0; // Acumula los números negativos introducidos

    System.out.println("Introduce un número por teclado");

    while (!answer.equals("n")) { // ! al principio niega la igualdad. Es el equivalente a !=

      System.out.print("Número: ");
      int num = sc.nextInt();
      
      if (num > 0) {
        suma += num; // Suma num a su valor anterior
        i++;
      } else if (num < 0) {
        sumaNeg += num; 
        j++;
      }
     
      System.out.println("¿Quieres introducir otro número?(s/n)");
      answer = sc.next().toLowerCase();
    }

    System.out.println("Ha introducido un total de  " + i + " números positivos. La suma de todos ellos da: " + suma);
    System.out.println("Ha introducido un total de  " + j + " números negativos. La suma de todos ellos da: " + sumaNeg);

    sc.close();
  }

}