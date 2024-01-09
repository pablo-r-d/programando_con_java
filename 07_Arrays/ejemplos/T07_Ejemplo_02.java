/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejemplo_02 {

  public static void main(String[] args) {

    int[] n = {26, -30, 0, 100, 50 };


    System.out.println("Los valores del array son los siguientes: ");
    for (int i : n) {
      System.out.printf("%4d\n", i);
    }

    System.out.println("El array contiene " + n.length + " elementos. ¿Cuál deseas ver? (0-4)");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.println("El elemento que se encuentra en la posición " + indice + " es el " + n[indice]);
  }

}
