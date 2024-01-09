/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejemplo_01 {

  public static void main(String[] args) {

    int[] n;
    n = new int[4];

    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;

    System.out.println("Los valores del array son los siguientes: ");
    for (int i : n) {
      System.out.printf("%4d\n", i);
    }

  }

}
