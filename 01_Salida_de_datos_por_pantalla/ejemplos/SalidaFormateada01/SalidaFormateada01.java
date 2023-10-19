/** 
 * Salida formateada utilizando enteros, decimales y decimales con precisión
 * 
* @author Pablo Ruiz
*/

// package SalidaFormateada01; // Si descomento esto ya no notifica error, pero deja de funcionar.

public class SalidaFormateada01 {
  public static void main(String[] args) {
    /**
     * %X es el formato de lo que vamos a escribir,
     * que se escribe tras una coma al final, fuera de las comillas.
     */
    System.out.printf("El número %d no tiene decimales.\n", 21); // %d indica entero
    System.out.printf("El número %f sale con decimales.\n", 21.0); // %f indica decimal (float)
    System.out.printf("El número %.3f sale exactamente con %d con decimales.\n", 50.0, 3);
    System.out.printf("Letraaaaaa: %c.\n", 83 ); // %c indica código ASCII

    // Para ver el ORDEN
    System.out.printf("Mostramos el segundo argumento: %2$d \n Y después el primero %1$.2f", 23.0, 56);
  }
}
