/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejercicio_07_Int {

  public static void main(String[] args) {

    int[] num = new int[100];

    for (int i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 11) + 10; // Numeros entre 0 y 10.9999... + 10
      System.out.print(num[i] + " ");
    }

    System.out.println();

    System.out.println("¿Qué número quieres sustituir?");
    int sustituido = Integer.parseInt(System.console().readLine());

    System.out.println("¿Por qué número quieres sustituirlo?");
    int sustituto = Integer.parseInt(System.console().readLine());

    for (int i : num) {
      if (i == sustituido) {
        i = sustituto;
        System.out.print("\"" + i + "\"" + " ");
      } else {
        System.out.print(i + " ");
      }

    }

  }

}