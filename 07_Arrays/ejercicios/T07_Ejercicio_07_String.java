/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejercicio_07_String {

  public static void main(String[] args) {

    String[] num = new String[100];

    for (int i = 0; i < 100; i++) {
      num[i] = Integer.toString((int) (Math.random() * 11) + 10); // Numeros entre 0 y 10.9999... + 10
      System.out.print(num[i] + " ");
    }

    System.out.println();

    System.out.println("¿Qué número quieres sustituir?");
    String sustituido = System.console().readLine();

    System.out.println("¿Por qué número quieres sustituirlo?");
    String sustituto = System.console().readLine();

    for (String i : num) {
      if (i.equals(sustituido)) {
        i = "\"" + sustituto + "\"";
      }
      System.out.print(i + " ");
    }

  }

}