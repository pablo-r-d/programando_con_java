/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class T02Ejercicio06 {
  public static void main(String[] args) {
    float baseImponible = 25.45f;
    float iva = 0.21f;

    System.out.printf("Base imponible: %.2f € \n", baseImponible );
    System.out.printf("IVA aplicado: %.0f %% \n", iva*100);
    System.out.printf("Impuestos totales: %.2f \n", baseImponible*iva);
    System.out.printf("Precio total: %.2f \n", baseImponible*(1+iva));
  }
}
