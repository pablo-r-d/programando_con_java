/** 
 * Salida formateada usando distintos flags
 * 
* @author Pablo Ruiz
*/

// package SalidaFormateada01;

public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d \n", 100); // 8 espacios a la izquierda del número
    System.out.printf("%08d \n", 100); // 8 ceros a la izquierda del número
    System.out.printf("%+d \n", -100); // muestra el signo del número
    System.out.printf("%-8d aa \n", 100); // 8 espacios a la derecha del número
  }
}
