package ejercicios;

/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

public class Quiniela_Evaluable {

  public static void main(String[] args) {

    int apuestaAux = 0;
    String apuestaTabla = "";
    String[] resultado = new String[15];
    String[][] apuestas = new String[15][4];
    int[] aciertos = new int[3];
    // int[] fallos = new int[3];
    // int[] total = new int[3];

    for (int i = 0; i < (apuestas.length - 1); i++) {
      System.out.printf("%2d. |", (i + 1));
      for (int j = 0; j < (apuestas[i].length - 1); j++) {
        apuestaAux = (int) (Math.random() * 3) + 1;

        switch (apuestaAux) {
          case 1:
            apuestaTabla = "1  ";
            break;

          case 2:
            apuestaTabla = " X ";
            break;

          case 3:
            apuestaTabla = "  2";
            break;

          default:
            break;
        }
        apuestas[i][j] = apuestaTabla;

        System.out.printf("%s|", apuestaTabla);
      }

      apuestaAux = (int) (Math.random() * 3) + 1;
      switch (apuestaAux) {
        case 1:
          resultado[i] = "1  ";
          break;

        case 2:
          resultado[i] = " X ";
          break;

        case 3:
          resultado[i] = "  2";
          break;

        default:
          break;
      }
      System.out.println("  " + resultado[i]);
    }

    System.out.println("------------------");

    for (int i = 0; i <= 2; i++) {

      apuestaAux = (int) (Math.random() * 4) + 1;
      switch (apuestaAux) {
        case 1:
          apuestaTabla = "1  ";
          break;

        case 2:
          apuestaTabla = " X ";
          break;

        case 3:
          apuestaTabla = "  2";
          break;

        case 4:
          apuestaTabla = "M";
          break;

        default:
          break;
      }
    }

    System.out.println();

    for (int i = 0; i < aciertos.length; i++) {
      for (int j = 0; j < (apuestas.length - 1); j++) {
        if (resultado[j].equalsIgnoreCase(apuestas[j][i])) {
          aciertos[i] += 1;
        } // else {
        // fallos[i] += 1;
        // }
      }
    }

    // for (int i = 0; i < total.length; i++) {
    // total[i] = aciertos[i] - fallos[i];
    // }
    System.out.print("    ");
    for (int i = 0; i < aciertos.length; i++) {
      System.out.print(aciertos[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < aciertos.length; i++) {
      if (aciertos[i] >= 10) {
        System.out.println("Enhorabuena, ha sido premiado");
      }
    }

    // System.out.print("15. | Local " + " Visitante ");
  }

}
