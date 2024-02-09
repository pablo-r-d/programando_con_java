/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    int limiteInferior;
    int limiteSuperior;
    int limiteInferiorDiv;
    int limiteSuperiorDiv;
    int intentos;
    int numeroAdivinar;
    int numero = 0;
    int opcion = 1;

    System.out.println("-D-I-V-I-N-A-R-E-M-");
    System.out.println("Divinarem pensará un número entre los valores que tu decidas.");
    System.out.print("Introduzca el mínimo valor del intervalo: ");
    limiteInferior = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el máximo valor del intervalo: ");
    limiteSuperior = Integer.parseInt(System.console().readLine());

    System.out.println("-D-I-V-I-N-A-R-E-M-");

    do {
      limiteInferiorDiv = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
      do {
        limiteSuperiorDiv = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
      } while (limiteInferiorDiv >= limiteSuperiorDiv);

      intentos = (int) (Math.log(limiteSuperiorDiv - limiteInferiorDiv + 1) / Math.log(2));

      System.out.println("Estoy pensando en un número entre " + limiteInferiorDiv + " y " + limiteSuperiorDiv);
      numeroAdivinar = (int) (Math.random() * (limiteSuperiorDiv - limiteInferiorDiv + 1)) + limiteInferiorDiv;
      System.out.println("Tienes " + intentos + " intentos");

      do {
        System.out.print("Escribe el número: ");
        numero = Integer.parseInt(System.console().readLine());

        if (numero > numeroAdivinar) {
          System.out.println("Te has pasado");
        } else if (numero < numeroAdivinar) {
          System.out.println("Te has quedado corto");
        } else {
          System.out.println("Enhorabuena! Has acertado.");
          System.out.println("Efectivamente, el número era: " + numero);
        }
        intentos--;
      } while (numero != numeroAdivinar && intentos > 0);

      if (numero != numeroAdivinar) {
        System.out.println("Has superado el número de intentos.");
        System.out.println("El número que había pensado era: " + numeroAdivinar);
      }

      System.out.println("Elige una opción: ");
      System.out.println("1. Volver a jugar.");
      System.out.println("2. Salir del juego.");
      do {
        System.out.print("Opción: ");
        opcion = Integer.parseInt(System.console().readLine());
      } while (opcion != 1 && opcion != 2);

      if (opcion == 2) {
        System.out.println("Gracias por jugar a -D-I-V-I-N-A-R-E-M-");
      }

    } while (opcion == 1);

  }

}