/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_25 {

  public static void main(String[] args) {

    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(System.console().readLine());

    int cociente;

    do {
      cociente = num%10;
      System.out.print(cociente);
      num /= 10;
    } while (num > 0);
  }
}
