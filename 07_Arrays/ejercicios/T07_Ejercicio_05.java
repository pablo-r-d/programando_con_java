/**
 * Ordena de menor a mayor y viceversa los números introducidos en un array.
 * En lugar de números introducidos por teclado utilicé números aleatorios
 * 
 * @author Pablo Ruiz
 */

public class T07_Ejercicio_05 {

  // Ordena un array monodimensional de menor a mayor
  public static int[] menorMayor(int[] num) {

    for (int j = 0; j < (num.length - 1); j++) {
      for (int i = 0; i < (num.length - 1); i++) {
        if (num[i] > num[(i + 1)]) {
          int numero = num[i];
          num[i] = num[(i + 1)];
          num[(i + 1)] = numero;
        }
      }
    }

    return num;

  }

  // Ordena un array monodimensional de mayor a menor
  public static int[] mayorMenor(int[] num) {

    for (int j = 0; j < (num.length - 1); j++) {
      for (int i = 0; i < (num.length - 1); i++) {
        if (num[i] < num[(i + 1)]) {
          int numero = num[i];
          num[i] = num[(i + 1)];
          num[(i + 1)] = numero;
        }
      }
    }

    return num;

  }

  public static void main(String[] args) {

    int[] num = new int[15];

    for (int j = 0; j < num.length; j++) {
      num[j] = (int) (Math.random() * 100);
    }

    num[5] = -8;

    menorMayor(num); // Ordena el array de menor a mayor
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println(); // Salto de línea

    System.out.println("Maximo: " + num[(num.length - 1)]);
    System.out.println("Mínimo: " + num[0]);

    mayorMenor(num); // Ordena el array de mayor a menor
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }

  }

}