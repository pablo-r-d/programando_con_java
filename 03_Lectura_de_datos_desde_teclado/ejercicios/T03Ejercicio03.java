import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T03Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Vamos a convertir pesetas a euros");
   
    Scanner sc = new Scanner (System.in, "Windows-1252");

    System.out.println("Introduce las pesetas: "); 
    int pesetas = sc.nextInt();
    
    float euros = (pesetas / 166.386f);
    System.out.printf("%.2f € \n", euros);
    System.out.println(euros);

    sc.close();
  }
}
