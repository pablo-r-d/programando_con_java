/*
  * Explica tu código aquí
  * 
  * @author Pablo Ruiz
*/
public class T05_Ejercicio_07 {

  public static void main(String[] args) {

    int i = 1234;

    System.out.print("Introduce la combinación: ");
    int password = Integer.parseInt(System.console().readLine());
    
    for (int j = 0; j < 3; j++) {
      if (password == i) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        break;

      } else {
        System.out.println("Lo siento, esa no es la combinación. Te quedan " + (3-j) + " intentos.");
        System.out.print("Inténtelo de nuevo: ");
        password = Integer.parseInt(System.console().readLine());
        
        if (password == i) {
          System.out.println("La caja fuerte se ha abierto satisfactoriamente");
          break;
        }
      }
    }    
  }
}