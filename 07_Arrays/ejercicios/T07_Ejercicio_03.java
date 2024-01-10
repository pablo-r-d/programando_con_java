/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T07_Ejercicio_03 {

  public static void main(String[] args) {

    int[] num = new int[10];

    for (int i = 0; i < num.length; i++) {
      System.out.print("Introduce un número entero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }

    for (int i = 9; i >= 0; i--) {
      System.out.print(num[i] + " ");
      
    }

  }

}
