/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 * @author Fernando Sánchez
 */

public class SieteyMedia {

  public static void main(String[] args) {

    // Creación de objetos
    Baraja baraja = new Baraja();
    Jugador jugador = new Jugador();
    Mano manoJugador = new Mano();
    Mano manoBanca = new Mano();
    Interfaz interfaz = new Interfaz();
    Configuracion configuracion = new Configuracion();

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

    // Comprobamos y ajustamos la configuración
    // configuracion.getConfPuntuacion();

    // Inicializamos la baraja
    baraja.iniciarBaraja();

    // Menú principal
    do {
      // Este bucle previene que el programa falle si el usuario introduce un valor o
      // tipo de dato erróneo
      do {
        try {
          interfaz.clearScreen();
          interfaz.menuInicio();
          inicio = Integer.parseInt(System.console().readLine());
          error = false;
        } catch (Exception e) {
          interfaz.clearScreen();
          error = true;
        }
      } while (error == true);

      // Switch para la elección del menú principal
      switch (inicio) {
        case 1: // Iniciar juego
          salir = false;
          interfaz.clearScreen();
          interfaz.escribirDeFormaLenta("Escriba su nombre: ");
          nombre = System.console().readLine();
          if (nombre.equalsIgnoreCase("sergio")) {
            interfaz.clearScreen();
            interfaz.escribirDeFormaLenta("¡Hola profe!");
            try {
              Thread.sleep(1500);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
            interfaz.clearScreen();
          }

          do {
            try { // Previene problemas si el usuario introduce un tipo de dato erróneo
              do { // Bucle do while para elegir monedero inicial
                interfaz.escribirDeFormaLenta("¿Con cuanto dinero va a jugar? ");
                System.out.print(" $");
                monedero = Integer.parseInt(System.console().readLine());
                if (monedero < 1) {
                  interfaz.escribirDeFormaLenta("No puedes empezar con $0");
                } else {
                  jugador.setMonedero(monedero);
                }
              } while (monedero < 1);
              error = false;
            } catch (Exception e) {
              interfaz.clearScreen();
              interfaz.escribirDeFormaLenta("Solo numeros enteros");
              error = true;
            }
          } while (error == true); // verificar errores

          // aqui empieza el juego
          while (jugador.getMonedero() > 0 && !salir) {

            baraja.vaciarBaraja();
            baraja.barajarBaraja();
            indiceBarajada = 0;
            do {
              try {
                jugador.setApuesta(jugador.apuesta()); // jugador.apuesta decide cuanto dinero apuesta el jugador
                error = false;
              } catch (Exception e) {
                interfaz.escribirDeFormaLenta("solo numeros enteros");
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

            interfaz.clearScreen();
            // Aqui empieza el turno del jugador
            while (manoJugador.getPuntuacion() < 7.5 && !finRonda) {

              manoJugador.meterCarta(indiceBarajada, baraja.sacarCarta(indiceBarajada)); // se le da una carta al jugador

              interfaz.escribirDeFormaLenta("Turno de: " + nombre);
              System.out.println("----------------------");
              // interfaz.reproducirSonido("carta.wav");
              manoJugador.mostrarMano();
              manoJugador.puntuacion(baraja.sacarCarta(indiceBarajada));
              if (interfaz.isMostrarPuntuacion()) {
                interfaz.escribirDeFormaLenta("Puntuación: " + manoJugador.getPuntuacion());
              }

              System.out.println("----------------------");
              indiceBarajada++; // el indice baraja sirve para saber cual es la siguiente carta a elegir

              if (manoJugador.getPuntuacion() > 7.5) { // si la puntuacion es mayor de 7.5 pierde el jugador
                System.out.printf("\n \u001B[31m");
                interfaz.escribirDeFormaLenta("¡Has perdido!");
                System.out.printf("\u001B[0m \n\n");
                jugador.setMonedero(jugador.getMonedero() - jugador.getApuesta());
                finRonda = true;
              } else if (manoJugador.getPuntuacion() == 7.5) { // si la puntuacion es exactamente 7.5 el jugador pierde
                System.out.printf("\n \u001B[32m");
                interfaz.escribirDeFormaLenta("¡Has Ganado!");
                System.out.printf("\u001B[0m \n\n");
                jugador.setMonedero(jugador.getMonedero() + jugador.getApuesta());
              } else {

                System.out.println();
                System.out.println("¿Quieres plantarte? (s/n)"); // pregunta al jugador si quiere plantarse
                do {// controla que solo se pueda introducir "s" o "n"
                  plantarse = System.console().readLine();

                } while (!plantarse.equalsIgnoreCase("s") && !plantarse.equalsIgnoreCase("n"));

                interfaz.clearScreen();

                // Aqui empieza el turno de la banca
                if (plantarse.equalsIgnoreCase("s")) {
                  while (manoBanca.getPuntuacion() <= manoJugador.getPuntuacion()) { // bucle para que la banca siga jugando
                    interfaz.escribirDeFormaLenta("turno de: La banca");
                    System.out.println("----------------------");
                    manoBanca.meterCarta(indiceBarajada, baraja.sacarCarta(indiceBarajada));
                    manoBanca.mostrarMano();
                    manoBanca.puntuacion(baraja.sacarCarta(indiceBarajada));
                    if (interfaz.isMostrarPuntuacion()) {
                      interfaz.escribirDeFormaLenta("Puntuación: " + manoBanca.getPuntuacion());
                    }

                    System.out.println("----------------------");

                    try { // sirve para esperar un tiempo antes de la siguiente carta
                      Thread.sleep(1500);
                    } catch (InterruptedException e) {
                      Thread.currentThread().interrupt();
                    }
                    indiceBarajada++; // El indice baraja sirve para saber cual es la siguiente carta a elegir
                    if (manoBanca.getPuntuacion() <= manoJugador.getPuntuacion()) {
                      interfaz.clearScreen();
                    }
                  }

                  if (manoBanca.getPuntuacion() == 7.5 || ((manoBanca.getPuntuacion() > manoJugador.getPuntuacion()
                      && manoBanca.getPuntuacion() < 7.5))) {
                    System.out.println("\n \u001B[31m Gana la banca. ");
                    interfaz.escribirDeFormaLenta("¡Has perdido!");
                    System.out.printf("\u001B[0m \n\n");
                    jugador.setMonedero(jugador.getMonedero() - jugador.getApuesta());
                  } else if (manoBanca.getPuntuacion() > 7.5) {
                    System.out.printf("\n \u001B[32m");
                    interfaz.escribirDeFormaLenta("¡Has Ganado!");
                    System.out.printf("\u001B[0m \n\n");
                    jugador.setMonedero(jugador.getMonedero() + jugador.getApuesta());
                  }

                  finRonda = true;
                }
              }
            }

            // luego de los dos turnos termina la ronda
            interfaz.escribirDeFormaLenta("FIN DE LA RONDA");
            System.out.println();
            interfaz.escribirDeFormaLenta("Te quedan $" + jugador.getMonedero()); // muestra cuanto dinero le queda en el monedero
            if (jugador.getMonedero() < 1) {
              interfaz.escribirDeFormaLenta("Te has quedado sin dinero");
              interfaz.escribirDeFormaLenta("Presione intro para volver al menu principal ");
              System.console().readLine();
              finRonda = true;
            } else {
              do {
                interfaz.escribirDeFormaLenta("¿Quiere continuar jugando? (s/n)"); // Preguntar al jugador si quiere seguir jugando
                string = (System.console().readLine());
                if (string.equalsIgnoreCase("n")) {
                  salir = true;
                }
              } while (!string.equalsIgnoreCase("s") && !string.equalsIgnoreCase("n"));
              // control para que solo se pueda introducir "s" o "n"

            }
            interfaz.clearScreen();
          }
          break;

        case 2: // Segunda opción del menú principal. Muestra las instrucciones del juego
          interfaz.clearScreen();
          interfaz.instrucciones();
          System.out.print("Precione intro para volver al menu principal");
          System.console().readLine();
          interfaz.clearScreen();

          break;

        case 3:
          interfaz.clearScreen();
          interfaz.opciones();
          break;

        case 4: // Tercera opción. Muestra los créditos del juego
          interfaz.clearScreen();
          interfaz.creditos();
          System.out.print("Precione intro para volver al menu principal");
          System.console().readLine();
          interfaz.clearScreen();

          break;

        case 5: // Cuarta opción. Salir del juego
          repetir = false;
          interfaz.clearScreen();
          System.out.println("¡Nos vemos!");
          try {
            Thread.sleep(1500);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
          interfaz.clearScreen();
          break;

        default: // Si se introduce cualquier otra cosa se repite el menú principal
          repetir = true;
          interfaz.clearScreen();

          break;
      }
    } while (repetir);
  }
}