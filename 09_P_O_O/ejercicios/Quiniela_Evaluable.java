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
    String[] resultado = new String[16];
    String[][] apuestas = new String[15][3];
    int[] aciertos = new int[3];

    for (int i = 0; i < (apuestas.length - 1); i++) {
      System.out.printf("%2d. |", (i + 1));
      for (int j = 0; j < (apuestas[i].length); j++) {
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
      System.out.println();
      // System.out.println(resultado[i]);
    }

    System.out.println("------------------");
    System.out.print("15. |");

    for (int i = 0; i <= 1; i++) {

      apuestaAux = (int) (Math.random() * 4) + 1;
      switch (apuestaAux) {
        case 1:
          apuestaTabla = "0";
          break;

        case 2:
          apuestaTabla = "1";
          break;

        case 3:
          apuestaTabla = "2";
          break;

        case 4:
          apuestaTabla = "M";
          break;

        default:
          break;
      }
      apuestas[14][i] = apuestaTabla;

      apuestaAux = (int) (Math.random() * 4) + 1;
      switch (apuestaAux) {
        case 1:
          resultado[14 + i] = "0";
          break;

        case 2:
          resultado[14 + i] = "1";
          break;

        case 3:
          resultado[14 + i] = "2";
          break;

        case 4:
          resultado[14 + i] = "M";
          break;

        default:
          break;
      }
    }

    System.out.printf(" Local %s Visitante %s", apuestas[14][0], apuestas[14][1]);

    System.out.println();

    for (int i = 0; i < aciertos.length; i++) {
      for (int j = 0; j < (apuestas.length - 1); j++) {
        if (resultado[j].equalsIgnoreCase(apuestas[j][i])) {
          aciertos[i] += 1;
        }
      }
    }

    System.out.println();

    for (int i = 0; i < aciertos.length; i++) {
      System.out.println("Aciertos columna " + (i + 1) + ": " + aciertos[i]);
    }
    System.out.println("Resultado pleno: " + "Local " + resultado[14] + " Visitante " + resultado[15]);
    System.out.println();
    for (int i = 0; i < aciertos.length; i++) {
      if (aciertos[i] >= 10) {
        System.out.println("Enhorabuena, ha sido premiado");
      }
    }

    if ((apuestas[14][0] == resultado[14]) && apuestas[14][1] == resultado[15]) {
      System.out.println("Enhorabuena, pleno acertado");
    }

  }

}
