/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
*/
public class T10_Ejercicio_06 {

  public static void main(String[] args) {

    int[] num = new int[5];

    for (int i = 0; i < num.length; i++) {
      System.out.print("Introduce un número: ");
      num[i] = Integer.parseInt(System.console().readLine()); 
    }

  }

}