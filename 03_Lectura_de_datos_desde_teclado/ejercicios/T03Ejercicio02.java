import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T03Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a convertir euros a pesetas");
    
    Scanner sc = new Scanner (System.in, "Windows-1252"); 

    System.out.println("Introduce los euros: "); 
    float euros = sc.nextFloat();
    
    int pesetas = ((int) Math.round(euros * 166.386));
    System.out.println(pesetas);
    System.out.println(euros * 166.386);

    sc.close();
  }
}
