/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_14 {

  public static void main(String[] args) {

    System.out.print("Introduce un número: ");
    int base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce un número: ");
    int exp = Integer.parseInt(System.console().readLine());

    System.out.println(Math.pow(base, exp));

  }

}
