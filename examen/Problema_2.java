/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Problema_2 {

  public static void main(String[] args) {
    int longitudMayor;
    int longitudMenor;
    String jugada1;
    String jugada2;
    int puntos1 = 0;
    int puntos2 = 0;

    System.out.print("Introduce el nombre del primer jugador: ");
    String nombre1 = System.console().readLine();

    System.out.print("Introduce el nombre del segundo jugador: ");
    String nombre2 = System.console().readLine();

    int longitud1 = nombre1.length();
    int longitud2 = nombre2.length();

    if (longitud1 > longitud2) {
      longitudMayor = nombre1.length();
      longitudMenor = nombre2.length();
    } else {
      longitudMayor = nombre2.length();
      longitudMenor = nombre1.length();
    }

    while (puntos1 <= 3 || puntos2 <= 3) {
      Boolean repetir = true;
      do {
        System.out.println("Jugador 1 elige: ");
        System.out.println("Piedra");
        System.out.println("Papel");
        System.out.println("Tijera");
        System.out.println();
        jugada1 = System.console().readLine();
        jugada1.toLowerCase();
        System.out.println();
        if (jugada1.equals("piedra") || jugada1.equals("papel") || jugada1.equals("tijera")
            || jugada1.equals("tijeras")) {
          repetir = false;
        }
      } while (repetir);

      System.out.print("\033[H\033[2J");
      System.out.flush();
      repetir = true;

      do {
        System.out.println("Jugador 2 elige: ");
        System.out.println("Piedra");
        System.out.println("Papel");
        System.out.println("Tijera");
        System.out.println();
        jugada2 = System.console().readLine();
        jugada2.toLowerCase();
        System.out.println();
        if (jugada2.equals("piedra") || jugada2.equals("papel") || jugada2.equals("tijera")
            || jugada2.equals("tijeras")) {
          repetir = false;
        }
      } while (repetir);

      switch (jugada1) {
        case "piedra":
          switch (jugada2) {
            case "piedra":
              System.out.println("Empate");
              break;

            case "papel":
              System.out.println("Punto para " + nombre2);
              puntos2++;
              break;

            case "tijeras", "tijera":
              System.out.println("Punto para " + nombre1);
              puntos1++;
              break;

            default:
              break;
          }

          break;

        case "papel":
          switch (jugada2) {
            case "piedra":
              System.out.println("Punto para " + nombre1);
              puntos1++;
              break;

            case "papel":
              System.out.println("Empate");
              break;

            case "tijeras", "tijera":
              System.out.println("Punto para " + nombre2);
              puntos2++;
              break;

            default:
              break;
          }

          break;

        case "tijeras", "tijera":
          switch (jugada2) {
            case "piedra":
              System.out.println("Punto para " + nombre2);
              puntos2++;
              break;

            case "papel":
              System.out.println("Punto para " + nombre1);
              puntos1++;
              break;

            case "tijeras", "tijera":
              System.out.println("Empate");
              break;

            default:
              break;
          }

          break;

        default:
          break;
      }

      System.out.print(" ");
      for (int i = 0; i < longitudMayor + 4; i++) {
        System.out.print("-");
      }
      // System.out.print(" ");
      // for (int i = 0; i < 3; i++) {
      // System.out.print("--- ");
      // }
      System.out.print(" --- --- ");

      for (int i = 0; i < longitudMayor + 4; i++) {
        System.out.print("-");
      }
      System.out.println();

      System.out.print("| ");
      if (longitud1 < longitud2) {
        for (int i = 0; i < (longitudMayor - longitudMenor + 1); i++) {
          System.out.print(" ");
        }
      } else {
        System.out.print(" ");
      }

      System.out.print(nombre1 + "  | " + puntos1 + " | " + puntos2 + " |  " + nombre2);

      if (longitud2 < longitud1) {
        for (int i = 0; i < (longitudMayor - longitudMenor + 2); i++) {
          System.out.print(" ");
        }
      } else {
        System.out.print("  ");
      }
      System.out.println("|");

      System.out.print(" ");
      for (int i = 0; i < longitudMayor + 4; i++) {
        System.out.print("-");
      }
      // System.out.print(" ");
      // for (int i = 0; i < 3; i++) {
      // System.out.print("--- ");
      // }
      System.out.print(" --- --- ");

      for (int i = 0; i < (longitudMayor + 4); i++) {
        System.out.print("-");
      }
      System.out.println();
      System.out.println();

    }

  }

}