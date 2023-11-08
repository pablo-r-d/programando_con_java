/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T04Ejercicio03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    
    System.out.print("Introduce un número del 1 al 7: ");
    int var = sc.nextInt();

    switch (var) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
    
      default:
        break;
    }

    sc.close();
  }

}