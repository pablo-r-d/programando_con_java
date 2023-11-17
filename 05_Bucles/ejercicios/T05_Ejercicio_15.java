/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_15 {

  public static void main(String[] args) {

    System.out.print("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce el exponente: ");
    int exp = Integer.parseInt(System.console().readLine());
    
    int base2 = 1;

    for (int i = 1; i < exp+1; i++) {
      
      System.out.print(base * base2 + "  ");
      base2 *= base;
      
    }

  }

}