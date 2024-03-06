/**
 * Main
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class SieteyMedia {

  public static void main(String[] args) {

    // Creación de objetos
    // Baraja baraja = new Baraja();
    Jugador jugador = new Jugador();
    Mano manoJugador = new Mano();
    Mano manoBanca = new Mano();

    // Declaración de variables
    int indiceBarajada;
    boolean salir = false;
    boolean finRonda = false;
    String string;
    int inicio = 0;
    boolean repetir = true;
    String nombre;
    int monedero = 0;
    boolean error = false;
    String plantarse;

    // Inicializamos la baraja
    Baraja.iniciarBaraja();

    // Menú principal
    do {
      // Este bucle previene que el programa falle si el usuario introduce un valor o
      // tipo de dato erróneo
      do {
        try {
          Interfaz.clearScreen();
          Interfaz.menuInicio();
          inicio = Integer.parseInt(System.console().readLine());
          error = false;
        } catch (Exception e) {
          Interfaz.clearScreen();
          error = true;
        }
      } while (error == true);

      // Switch para la elección del menú principal
      switch (inicio) {
        case 1: // Iniciar juego
          salir = false;
          Interfaz.clearScreen();
          Interfaz.escribirDeFormaLenta("Escribe tu nombre: ");
          nombre = System.console().readLine();
          if (nombre.equalsIgnoreCase("sergio")) {
            Interfaz.clearScreen();
            Interfaz.escribirDeFormaLenta("¡Hola profe!");
            try {
              Thread.sleep(1500);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
            Interfaz.clearScreen();
          }

          do {
            try { // Previene problemas si el usuario introduce un tipo de dato erróneo
              do { // Bucle do while para elegir monedero inicial
                Interfaz.escribirDeFormaLenta("¿Con cuánto dinero vas a jugar? ");
                System.out.print(" $");
                monedero = Integer.parseInt(System.console().readLine());
                if (monedero < 1) {
                  Interfaz.escribirDeFormaLenta("No puedes empezar con $0");
                } else {
                  jugador.setMonedero(monedero);
                }
              } while (monedero < 1);
              error = false;
            } catch (Exception e) {
              Interfaz.clearScreen();
              Interfaz.escribirDeFormaLenta("Sólo numeros enteros");
              error = true;
            }
          } while (error == true);

          // Aquí empieza el juego
          while (jugador.getMonedero() > 0 && !salir) {

            Baraja.vaciarBaraja();
            Baraja.barajarBaraja();
            indiceBarajada = 0;
            do {
              try {
                jugador.setApuesta(jugador.apuesta()); // jugador.apuesta decide cuanto dinero apuesta el jugador
                error = false;
              } catch (Exception e) {
                Interfaz.escribirDeFormaLenta("Sólo numeros enteros");
                System.out.println();
                error = true;
              }
            } while (error == true); // verificacion de errores

            // Reset de las puntuaciones y las manos del jugador y la banca
            finRonda = false;
            manoJugador.setPuntuacion(0);
            manoBanca.setPuntuacion(0);
            manoJugador.vaciarMano();
            manoBanca.vaciarMano();

            Interfaz.clearScreen();
            // Aqui empieza el turno del jugador
            while (manoJugador.getPuntuacion() < 7.5 && !finRonda) {

              manoJugador.meterCarta(indiceBarajada, Baraja.sacarCarta(indiceBarajada)); // se le da una carta al
                                                                                         // jugador

              System.out.println("Turno de: " + nombre);
              System.out.println("----------------------");
              manoJugador.mostrarMano();
              manoJugador.puntuacion(Baraja.sacarCarta(indiceBarajada));
              if (Interfaz.isMostrarPuntuacion()) {
                Interfaz.escribirDeFormaLenta("Puntuación: " + manoJugador.getPuntuacion() + "\n");
              }

              System.out.println("----------------------");
              indiceBarajada++; // el indice baraja sirve para saber cuál es la siguiente carta a elegir

              if (manoJugador.getPuntuacion() > 7.5) { // si la puntuación es mayor de 7.5 pierde el jugador
                System.out.printf("\n \u001B[31m");
                Interfaz.escribirDeFormaLenta("¡Has perdido!");
                System.out.printf("\u001B[0m \n\n");
                jugador.setMonedero(jugador.getMonedero() - jugador.getApuesta());
                finRonda = true;
              } else if (manoJugador.getPuntuacion() == 7.5) { // si la puntuación es exactamente 7.5 el jugador pierde
                System.out.printf("\n \u001B[32m");
                Interfaz.escribirDeFormaLenta("¡Has Ganado!");
                System.out.printf("\u001B[0m \n\n");
                jugador.setMonedero(jugador.getMonedero() + jugador.getApuesta());
              } else {

                System.out.println();
                System.out.println("¿Quieres plantarte? (s/n)"); // pregunta al jugador si quiere plantarse
                do {// controla que solo se pueda introducir "s" o "n"
                  plantarse = System.console().readLine();

                } while (!plantarse.equalsIgnoreCase("s") && !plantarse.equalsIgnoreCase("n"));

                Interfaz.clearScreen();

                // Aqui empieza el turno de la banca
                if (plantarse.equalsIgnoreCase("s")) {
                  while (manoBanca.getPuntuacion() <= manoJugador.getPuntuacion()) { // bucle para que la banca siga//
                                                                                     // jugando
                    System.out.println("turno de: La banca");
                    System.out.println("----------------------");
                    manoBanca.meterCarta(indiceBarajada, Baraja.sacarCarta(indiceBarajada));
                    manoBanca.mostrarMano();
                    manoBanca.puntuacion(Baraja.sacarCarta(indiceBarajada));
                    if (Interfaz.isMostrarPuntuacion()) {
                      Interfaz.escribirDeFormaLenta("Puntuación: " + manoBanca.getPuntuacion() + "\n");
                    }

                    System.out.println("----------------------");

                    try { // sirve para esperar un tiempo antes de la siguiente carta
                      Thread.sleep(1500);
                    } catch (InterruptedException e) {
                      Thread.currentThread().interrupt();
                    }
                    indiceBarajada++; // El indice baraja sirve para saber cual es la siguiente carta a elegir
                    if (manoBanca.getPuntuacion() <= manoJugador.getPuntuacion()) {
                      Interfaz.clearScreen();
                    }
                  }

                  if (manoBanca.getPuntuacion() == 7.5 || ((manoBanca.getPuntuacion() > manoJugador.getPuntuacion()
                      && manoBanca.getPuntuacion() < 7.5))) {
                    System.out.println("\n \u001B[31m Gana la banca. ");
                    Interfaz.escribirDeFormaLenta("¡Has perdido!");
                    System.out.printf("\u001B[0m \n\n");
                    jugador.setMonedero(jugador.getMonedero() - jugador.getApuesta());
                  } else if (manoBanca.getPuntuacion() > 7.5) {
                    System.out.printf("\n \u001B[32m");
                    Interfaz.escribirDeFormaLenta("¡Has Ganado!");
                    System.out.printf("\u001B[0m \n\n");
                    jugador.setMonedero(jugador.getMonedero() + jugador.getApuesta());
                  }

                  finRonda = true;
                }
              }
            }

            // luego de los dos turnos termina la ronda
            Interfaz.escribirDeFormaLenta("FIN DE LA RONDA");
            System.out.println();
            Interfaz.escribirDeFormaLenta("Te quedan $" + jugador.getMonedero() + "\n"); // muestra cuanto dinero le
                                                                                         // queda en el monedero
            if (jugador.getMonedero() < 1) {
              Interfaz.escribirDeFormaLenta("Te has quedado sin dinero\n");
              Interfaz.escribirDeFormaLenta("Presione intro para volver al menu principal \n");
              System.console().readLine();
              finRonda = true;
            } else {
              do {
                Interfaz.escribirDeFormaLenta("¿Quiere continuar jugando? (s/n)\n"); // Preguntar al jugador si quiere
                                                                                     // seguir jugando
                string = (System.console().readLine());
                if (string.equalsIgnoreCase("n")) {
                  salir = true;
                }
              } while (!string.equalsIgnoreCase("s") && !string.equalsIgnoreCase("n"));
              // control para que solo se pueda introducir "s" o "n"

            }
            Interfaz.clearScreen();
          }
          break;

        case 2: // Segunda opción del menú principal. Muestra las instrucciones del juego
          Interfaz.clearScreen();
          Interfaz.instrucciones();
          System.out.print("Presiona intro para volver al menú principal");
          System.console().readLine();
          Interfaz.clearScreen();

          break;

        case 3:
          Interfaz.clearScreen();
          Interfaz.opciones();
          break;

        case 4: // Tercera opción. Muestra los créditos del juego
          Interfaz.clearScreen();
          Interfaz.creditos();
          System.out.print("Presiona intro para volver al menú principal");
          System.console().readLine();
          Interfaz.clearScreen();

          break;

        case 5: // Cuarta opción. Salir del juego
          repetir = false;
          Interfaz.clearScreen();
          System.out.println("¡Nos vemos!");
          try {
            Thread.sleep(1500);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          Interfaz.clearScreen();
          break;

        default: // Si se introduce cualquier otra cosa se repite el menú principal
          repetir = true;
          Interfaz.clearScreen();

          break;
      }
    } while (repetir);
  }
}