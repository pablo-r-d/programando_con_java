/** 
 * Vida útil SSD
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class Problema04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("VIDA ÚTIL SSD");
    System.out.println("==================");

    System.out.print("Introduzca el factor TBW de su disco duro SSD: ");
    int tbw = sc.nextInt();

    double maxT = tbw / (365.0*6.0);

    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: %.4f TB (%.1f GB)", maxT, maxT*1000 );

    sc.close();
  }

}