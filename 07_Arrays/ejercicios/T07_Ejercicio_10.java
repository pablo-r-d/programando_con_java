
/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
*/

import matematicas.Varias;

public class T07_Ejercicio_10 {

  public static void main(String[] args) {

    int[] num = new int[20];
    int[][] primo = new int[2][20];
    int indice = 0;

    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random()*101);
    }

    for (int i : num) {
      if (i % 2 == 0) {
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