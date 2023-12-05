/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_24 {

  public static void main(String[] args) {

    System.out.print("Introduce el número de numFilas de la pirámide: ");
    int numFilas = Integer.parseInt(System.console().readLine());

    for (int fila = 1; fila <= numFilas; fila++) {
      
      for (int espacios = numFilas - fila; espacios >= 0; espacios--) {
        System.out.print(" ");
      }
      
      
      for (int j = 0; j <= fila ; j++) {
        // int num = numFilas-j;
        if (j <=0 ) {
          
        } else {
          System.out.print(j);
        }
      }
      
      // System.out.print(numFilas-(numFilas+fila));

      for (int j = fila-1; j > 0; j--) {
        
        if (j <=0 ) {
          
        } else {
          System.out.print(j);
        }
      }
      System.out.println();
    }

  }

}
