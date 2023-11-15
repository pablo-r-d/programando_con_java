/** 
 * Programa que lee  números de teclado mientras el número introducido sea par
 * 
* @author Pablo Ruiz
*/
public class EjemploDoWhile02 {

  public static void main(String[] args) {
    int num = 0;

    do {
      System.out.print("Introduce un número par: ");
      num = Integer.parseInt(System.console().readLine());

      if (num % 2 == 0) {
        System.out.println("Ay qué bonito es el número par" + num);
      }else{
        System.out.println("No me gustan los números impares. Adiós.");
      }
    } while (num % 2 == 0);
  }
}