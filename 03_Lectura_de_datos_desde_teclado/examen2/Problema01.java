/** 
 * Bandera de Andalucía con el caracter unicode \u2588
 * 
* @author Pablo Ruiz
*/
public class Problema01 {

  public static void main(String[] args) {

    System.out.print("\033[38;5;40m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588   \n");
    System.out.print("\033[38;5;255m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588   \n");
    System.out.print("\033[38;5;40m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588   \n");

    System.out.print("\033[0m");

    System.out.println("\033[0m");
  }

}