/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public abstract class Interfaz {
  private static boolean mostrarPuntuacion = true;
  private static String respuesta;
  private static int velocidad = 40;

  // Metodos
  public static void menuInicio() {
    System.out.println("***********************************");
    System.out.println("*  Bienvenido al juego 7 y media  *");
    System.out.println("***********************************");
    System.out.println("* 1. Comenzar juego               *");
    System.out.println("* 2. Instrucciones                *");
    System.out.println("* 3. Configuraciones              *");
    System.out.println("* 4. Créditos                     *");
    System.out.println("* 5. Salir                        *");
    System.out.println("***********************************");
  }

  public static boolean isMostrarPuntuacion() {
    return mostrarPuntuacion;
  }

  public static void instrucciones() {
    System.out.println("*****************************************************************************");
    System.out.println("* SIETE Y MEDIA es un juego de cartas donde el objetivo principal es        *");
    System.out.println("* acercarse lo más posible a la puntuación de 7,5.                          *");
    System.out.println("* Se utiliza la baraja de cartas española de 4 palos y 10 cartas por cada   *");
    System.out.println("* palo.                                                                     *");
    System.out.println("* Cada vez que obtengas una carta incrementa la puntuación de tu jugada de  *");
    System.out.println("* manera que las cartas del 1 al 7 tienen una puntuación equivalente a su   *");
    System.out.println("* número y las cartas Sota, Caballo y Rey una puntuación de medio punto     *");
    System.out.println("* cada una, si te pasas de 7,5 pierdes.                                     *");
    System.out.println("* Después de cada carta tendras la opción de plantarte, si eliges plantarte *");
    System.out.println("* jugará la banca para intentar superar tu puntuación, si la banca se pasa  *");
    System.out.println("* de 7,5 tú ganas y se duplica tu apuesta ¡¡Buena suerte!!                  *");
    System.out.println("*****************************************************************************");

  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void creditos() {
    System.out.println("*************************************************");
    System.out.println("* Juego hecho por Fernando Sanchez y Pablo Ruiz *");
    System.out.println("*            Gracias por jugar :)               *");
    System.out.println("*************************************************");
  }

  public static void opciones() {
    System.out.println("*************************");
    System.out.println("* 1. Mostrar puntuación *");
    System.out.println("* 2. Velocidad de texto *");
    System.out.println("*************************");
    int respuesta = Integer.parseInt(System.console().readLine());

    if (respuesta == 1) {
      mostrarPuntuacion();
    } else if (respuesta == 2) {
      velocidad();
    }
  }

  public static void mostrarPuntuacion() {
    do {
      System.out.println(" ¿Mostrar puntuación de las manos? (s/n)");
      respuesta = System.console().readLine();
      if (respuesta.equalsIgnoreCase("s")) {
        mostrarPuntuacion = true;
      } else if (respuesta.equalsIgnoreCase("n")) {
        mostrarPuntuacion = false;
      }
    } while (!respuesta.equalsIgnoreCase("n") && !respuesta.equalsIgnoreCase("s"));

  }

  public static void escribirDeFormaLenta(String mensaje) {
    try {
      for (char c : mensaje.toCharArray()) {
        System.out.print(c);
        Thread.sleep(velocidad);
      }

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void velocidad() {
    boolean salir = true;
    do {

      System.out.println("*********************************");
      System.out.println("* Eliga una velocidad del texto *");
      System.out.println("*********************************");
      System.out.println("* 1. Lento                      *");
      System.out.println("* 2. Normal                     *");
      System.out.println("* 3. Rápido                     *");
      System.out.println("* 4. Instantáneo                *");
      System.out.println("*********************************");
      int respuesta = Integer.parseInt(System.console().readLine());

      switch (respuesta) {
        case 1:
          velocidad = 100;
          break;
        case 2:
          velocidad = 70;
          break;
        case 3:
          velocidad = 40;
          break;
        case 4:
          velocidad = 0;
          break;
        default:
          salir = false;
          break;
      }
    } while (salir == false);

  }
}