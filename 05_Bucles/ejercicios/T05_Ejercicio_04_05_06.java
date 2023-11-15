/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_04_05_06 {

  public static void main(String[] args) {

    for (int i = 320; i > 159; i -= 20) {
      System.out.println(i);
    }

    int i = 320;
    while (i > 159) {
      System.out.println(i);
      i -= 20;
    }

    i = 320;
    do {
      System.out.println(i);
      i -= 20;
    } while (i > 159);

  }

}