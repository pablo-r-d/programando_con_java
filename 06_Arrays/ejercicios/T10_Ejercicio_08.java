/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T10_Ejercicio_08 {

  public static void main(String[] args) {

    int[] temperatura = new int[12];

    System.out.println("Introduce la temperatura media de cada mes: ");
    for (int i = 0; i < temperatura.length; i++) {
      System.out.print("Temperatura mes " + (i + 1) + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    int mes = 1;
    for (int i : temperatura) {
      System.out.printf("Temperatura mes %2d: ", mes);
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
      mes++;
    }

  }

}