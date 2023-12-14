/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Problema_1 {

  public static void main(String[] args) {

    int nota1, nota2, nota3;
    double media;
    String repetir;

    do {
      System.out.print("Introduce un nombre (Apellido1 Apellido2, Nombre): ");
      String nombre = System.console().readLine();

      do {
        System.out.println("Introduce la primera nota");
        nota1 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce la segunda nota");
        nota2 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce la tercera nota");
        nota3 = Integer.parseInt(System.console().readLine());

        if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10) {
          System.out.println("Has introducido alguna de las notas de forma incorrecta.");
        }

      } while (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10);

      media = (nota1 + nota2 + nota3) / 3;

      System.out.print(" ");
      for (int i = 0; i < nombre.length() + 2; i++) {
        System.out.print("-");
      }
      System.out.print(" ");
      for (int i = 0; i < 3; i++) {
        System.out.print("--- ");
      }
      System.out.println("------");

      System.out.printf("| \033[1m%s \033[0m| ", nombre);

      if (nota1 >= 5) {
        System.out.printf("\033[1;32m%d \033[0m| ", nota1);
      } else {
        System.out.printf("\033[1;31m%d \033[0m| ", nota1);
      }

      if (nota2 >= 5) {
        System.out.printf("\033[1;32m%d \033[0m| ", nota2);
      } else {
        System.out.printf("\033[1;31m%d \033[0m| ", nota2);
      }

      if (nota3 >= 5) {
        System.out.printf("\033[1;32m%d \033[0m| ", nota3);
      } else {
        System.out.printf("\033[1;31m%d \033[0m| ", nota3);
      }

      if (media >= 5) {
        System.out.printf("\033[1;32m%.2f \033[0m| \n", media);
      } else {
        System.out.printf("\033[1;31m%.2f \033[0m| \n", media);
      }

      System.out.print(" ");
      for (int i = 0; i < nombre.length() + 2; i++) {
        System.out.print("-");
      }
      System.out.print(" ");
      for (int i = 0; i < 3; i++) {
        System.out.print("--- ");
      }
      System.out.println("------");

      System.out.print("¿Deseas continuar introduciendo notas? (S/N)");
      repetir = System.console().readLine();
    } while (repetir.equals("S") || repetir.equals("s"));

    if (repetir.equals("N") || repetir.equals("n")) {

    } else {
      System.out.println("No has introducido datos correctos.");
    }

  }

}