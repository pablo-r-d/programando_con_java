/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    
    System.out.println("Introduce la base imponible para calcular el total: ");
    float baseImponible = sc.nextFloat();

    System.out.println("Introduce el iva para calcular el total: ");
    float iva = sc.nextFloat();

    float impuestos = baseImponible * (iva/100);

    System.out.printf("Base imponible:    %10.2f € \n", baseImponible );
    System.out.printf("IVA aplicado:      %10.0f %% \n", iva);
    System.out.printf("Impuestos totales: %10.2f € \n", impuestos);
    System.out.println("-------------------------------");
    System.out.printf("Precio total:      %10.2f € \n", baseImponible + impuestos);

    sc.close();
  }  
}
