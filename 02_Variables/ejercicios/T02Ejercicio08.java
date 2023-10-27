/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T02Ejercicio08 {
  public static void main(String[] args) {
    char l1 = 's';
    char l2 = 'a';
    char l3 = 'l';
    char l4 = 'u';
    char l5 = 'd';

    /*
     * Si se hace así se suman los valores ASCII, no los caracteres
     * String palabra = l1 + l2 + l3 + l4 + l5; 
     */
    
     String palabra = "" + l1 + l2 + l3 + l4 + l5;
     System.out.println(palabra);
  }
}
