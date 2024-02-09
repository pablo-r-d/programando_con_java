public class Interfaz {
  private boolean mostrarPuntuacion = true;
  private String respuesta;
  //////////////// Metodos

  public void menuInicio() {
    System.out.println("***********************************");
    System.out.println("*  Bienvendio al juego 7 y media  *");
    System.out.println("***********************************");
    System.out.println("* 1. comenzar juego               *");
    System.out.println("* 2. instrucciones                *");
    System.out.println("* 3. configuraciones              *");
    System.out.println("* 4. creditos                     *");
    System.out.println("* 5. salir                        *");
    System.out.println("***********************************");
  }

  public boolean isMostrarPuntuacion() {
    return mostrarPuntuacion;
  }

  public void instrucciones() {
    System.out.println("***************************************************************************");
    System.out.println("* SIETE Y MEDIA es un juego de cartas donde el objetivo principal es      *");
    System.out.println("* acercarse lo más posible a la puntuación de 7,5.                        *");
    System.out.println("* Se utiliza la baraja de cartas española de 4 palos y 10 cartas por cada *");
    System.out.println("* palo.                                                                   *");
    System.out.println("* Cada vez que obtengas una carta incrementa la puntuación de tu jugada de*");
    System.out.println("* manera que las cartas del 1 al 7 tienen una puntuación equivalente a su *");
    System.out.println("* número y las cartas Sota, Caballo y Rey una puntuación de medio punto   *");
    System.out.println("* cada una, si te pasas de 7,5 pierdes.                                   *");
    System.out.println("* Despues de cada carta tendras la opcion de plantarte, si eliges pantarte*");
    System.out.println("* jugara la banca para intentar superar tu puntuacion, si la banca se pasa*");
    System.out.println("* de 7,5 tu ganas y se duplica tu apuesta !!Buena suerte¡¡.               *");
    System.out.println("***************************************************************************");

  }

  public void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void creditos() {
    System.out.println("*************************************************");
    System.out.println("* Juego hecho por Fernando Sanchez y Pablo Ruiz *");
    System.out.println("*            gracias por jugar :)               *");
    System.out.println("*************************************************");
  }

  public void opciones() {
    do {
      System.out.println(" ¿Mostrar puntuacion de las manos? (s/n)");
      respuesta = System.console().readLine();
      if (respuesta.equalsIgnoreCase("s")) {
        mostrarPuntuacion = true;
      } else if (respuesta.equalsIgnoreCase("n")) {
        mostrarPuntuacion = false;
      }
    } while (!respuesta.equalsIgnoreCase("n") && !respuesta.equalsIgnoreCase("s"));

  }
}
