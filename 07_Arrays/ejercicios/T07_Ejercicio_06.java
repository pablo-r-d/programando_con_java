/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejercicio_06 {

  public static int[] invertArray(int[] num) {
    int[] num2 = new int[num.length];
    for (int i = 0; i < num.length; i++) {
      num2[i] = num[(num.length - 1 - i)];
    }
    System.out.print("Invertarray: ");
    for (int i : num2) {
      System.out.print(i + " ");
    }
    System.out.println();
    return num2;
  }

  public static void main(String[] args) {

    int[] num = new int[5];

    for (int i = 0; i < num.length; i++) {
      System.out.print("Introduce un número y pulsa INTRO: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    // int[] numero = num; // Esto hace que apunten al mismo lugar de memoria auneuq
    // tengan diferente nombre
    int[] numero = new int[5];
    for (int i = 0; i < numero.length; i++) {
      numero[i] = num[i];
    }

    // Yo hice la función invertArray.
    // Esta es la versión de Sergio sin un array auxiliar

    // Rotamos el array
    int aux = num[(num.length - 1)];
    for (int i = (num.length - 1); i > 0; i--) {
      num[i] = num[(i - 1)];
    }
    num[0] = aux;

    for (int i : num) {
      System.out.printf("%4d", i);
    }

    System.out.println();
    num[0] = 45;

    for (int i : invertArray(numero)) {
      System.out.print(i + " ");
    }

    

  }

}