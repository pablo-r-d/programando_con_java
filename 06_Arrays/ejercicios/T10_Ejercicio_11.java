
/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
*/

import matematicas.Varias;

public class T10_Ejercicio_11 {

  public static void main(String[] args) {

    int[] num = new int[10];
    int[][] primo = new int[2][10];
    int indice = 0;

    for (int i = 0; i < num.length; i++) {
      System.out.print("Introduce un número: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }

    for (int i : num) {
      if (matematicas.Varias.esPrimo(i)) {
        primo[0][indice] = i;
      } else {
        primo[1][indice] = i;
      }
      indice++;
    }

    indice = 0;

    for (int i = 0; i < num.length; i++) {
      if (primo[0][i] != 0) {
        num[indice] = primo[0][i];
        indice++;
      }
    }

    for (int i = 0; i < num.length; i++) {
      if (primo[1][i] != 0) {
        num[indice] = primo[1][i];
        indice++;
      }
    }
    for (int i : num) {
      System.out.print(i + " ");
    }

  }
}