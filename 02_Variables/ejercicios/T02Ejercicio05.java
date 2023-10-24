/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T02Ejercicio05 {
  public static void main(String[] args) {
    double pesetas = 6000.00;
    int euros = ((int) Math.round(pesetas / 166.386));
    System.out.println(euros);
    System.out.println(pesetas / 166.386);
  }
}