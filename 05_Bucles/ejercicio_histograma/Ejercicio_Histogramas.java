/*
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
*/
public class Ejercicio_Histogramas {

  public static void main(String[] args) {
    int num = 1;
    long num1 = 0;
    int i = 0;
    int columnas = 1;
    int cero = 0;
    
    System.out.println("Introduzca un número entre 0 y 9 y pulse INTRO. Introduzca un número negativo si desea parar.");
    while (num >= 0) {
      num = Integer.parseInt(System.console().readLine());
      if (num >= 0 && num <= 9) {
        if (num == 0) {
          num = 10;          
        }
        num1 = num1 + ((num + cero) * (int) Math.pow(10, i));
        i++;
        System.out.println("[" + num1 + "]");
        // System.out.println(i);
        if (num == 10) { 
          cero = -1;
        } else {
          cero = 0;
        }
      }

      if (num > columnas && num != 10) {
        columnas = num;
      } else if (columnas >= 10) {
        columnas = 9;
      }
    }
    if (cero == -1) {
      num1 -= 1 * (int) Math.pow(10, i);
    }

    while (num1 >= 1) {

      int numero = (int) (num1 % 10);
      // System.out.println(numero);

      System.out.print("\u2554\u2550\u2550\u2550\u2566");

      for (int j = columnas; j >= 0; j--) {
        System.out.print("\u2550\u2550\u2550\u2566");
      }

      System.out.println();

      int cifra = numero + 1;
      for (int j = columnas; j >= 0; j--) {
        if (cifra == (numero + 1)) {
          System.out.printf("\u2551 %d ", numero);
        } else if (cifra > 0) {
          System.out.print("\u2551 * ");
        } else {
          System.out.print("\u2551   ");
        }
        cifra--;
      }
      System.out.println("\u2551");

      num1 = ((num1 - (num1 % 10)) / 10);
    }
    for (int j = columnas; j >= 0; j--) {
      System.out.print(" \u2550\u2550\u2550");
    }

    if (cero == -1) {
      // for (int j = columnas; j >= 0; j--) {
      // System.out.print(" ---");
      // }
      System.out.println();

      System.out.printf("\u2551 %d ", 0);
      for (int j = columnas; j >= 0; j--) {
        System.out.print("\u2551   ");
      }
      System.out.println();
    }
    for (int j = columnas; j >= 0; j--) {
      System.out.print(" \u2550\u2550\u2550");
    }
  }
}