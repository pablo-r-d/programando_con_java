import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T03Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in, "Windows-1252");
   
    System.out.println("Introduce un número: "); 
    float x = sc.nextInt();
    
    System.out.println("Introduce otro número: "); 
    float y = sc.nextInt();

    System.out.println(x);
    System.out.println(y);
    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x / y);

    sc.close();
  }
}
