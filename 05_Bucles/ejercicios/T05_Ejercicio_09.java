/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_09 {

  public static void main(String[] args) {

    System.out.print("Introduce un número: ");
    long num = Long.parseLong(System.console().readLine());

    int digitos = 0;
    long numero = num;
    while (num > 0) {
      num /= 10;
      digitos ++;
    }

    System.out.println("El número " + numero + " tiene " + digitos + " dígito(s).");
  }
}