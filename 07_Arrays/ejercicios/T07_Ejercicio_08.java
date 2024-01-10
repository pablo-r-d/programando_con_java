/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejercicio_08 {

  public static void main(String[] args) {

    int[] temperatura = new int[4];
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    System.out.println("Introduce la temperatura media de cada mes: ");
    for (int i = 0; i < temperatura.length; i++) {
      System.out.print("Temperatura mes de " + meses[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println();
    System.out.println();

    int mes = 0;
    for (int i : temperatura) {
      System.out.printf("Temperatura mes de %s:       ", meses[mes]);
      
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
      mes++;
    }

  }

}