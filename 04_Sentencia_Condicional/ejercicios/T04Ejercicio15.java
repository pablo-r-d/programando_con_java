/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T04Ejercicio15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("¿Qué caracter quieres usar?");
    char car = sc.next().charAt(0);   

    System.out.println("¿Hacia dónde debe estar orientada la pirámide?");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Izquierda");
    System.out.println("4. Derecha");
    int pir = sc.nextInt();
    
    
    switch (pir) {
      case 1:
        System.out.printf("  %c%n", car);
        System.out.printf(" %c%c%c%n", car, car, car);
        System.out.printf("%c%c%c%c%c%n", car, car, car, car, car);

        break;
      
      case 2:
        System.out.printf("%c%c%c%c%c%n", car, car, car, car, car);
        System.out.printf(" %c%c%c%n", car, car, car);
        System.out.printf("  %c%n", car);

        break;

      case 3:
      System.out.printf("    %c%n", car);
      System.out.printf("  %c %c%n", car, car);
      System.out.printf("%c %c %c%n", car, car, car);
      System.out.printf("  %c %c%n", car, car);
      System.out.printf("    %c%n", car);
        
        break;

      case 4:
      System.out.printf("%c%n", car);
      System.out.printf("%c %%nc", car, car);
      System.out.printf("%c %c %c%n", car, car, car);
      System.out.printf("%c %c%n", car, car);
      System.out.printf("%c%n", car);
        
        break;

      default:
        break;
    }
    
    sc.close();
  }

}
