/** 
 * Factura
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class Problema03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    
    System.out.println("Nombre del artículo: ");
    String nombre = System.console().readLine();
    
    System.out.println("Precio base: ");
    double precio = sc.nextDouble();
   
    System.out.println("Cantidad de unidades: ");
    int cantidad = sc.nextInt();   

    double subtotal = precio * cantidad;
    double subdesc = subtotal - (subtotal * 0.15);

    System.out.println("Factura");
    System.out.println("===============================================");

    System.out.printf("%-25s %20s \n", "Artículo", nombre);
    System.out.printf("%-25s %11.2f €/unidad \n", "Precio", precio);
    System.out.printf("%-25s %20d \n", "Cantidad", cantidad);
    System.out.printf("%-25s %18.2f € \n", "Subtotal", subtotal);
    System.out.printf("%-25s %+18.2f € \n", "Descuento (15%%)", subtotal * (-0.15));
    System.out.printf("%-25s %18.2f € \n", "Subtotal con descuento", subdesc);
    System.out.printf("%-25s %+18.2f € \n", "IVA (21%%)", subdesc * 0.21);

    System.out.println("===============================================");
    System.out.printf("\033[48;5;246m%-25s %18.2f € \n", "TOTAL", subdesc * 1.21);

    System.out.print("\033[0m");

    sc.close();
  }

}