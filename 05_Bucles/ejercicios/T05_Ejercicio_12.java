/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T05_Ejercicio_12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    int primero = 1;
    int segundo = 0;
    int siguiente = 0;

    System.out.print("Introduce un número: ");
    int num = sc.nextInt();
    
    for (int i = 0; i <= num; i++) {      
      System.out.print(siguiente + "  ");
      siguiente = primero + segundo;
      primero = segundo;
      segundo = siguiente;
    }
    sc.close();
  }
}
