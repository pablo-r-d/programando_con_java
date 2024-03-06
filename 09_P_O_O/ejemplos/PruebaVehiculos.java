/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class PruebaVehiculos {

  public static void main(String[] args) {

    Coche toyota = new Coche("1234ABC", "Toyota", "Prius");
    Bicicleta bh = new Bicicleta("BH");

    Vehiculo[] vehiculos = { toyota, bh }; // Se puede crear un array de objetos que comparten
                                           // superclase, incluso si esta es abstracta

    int opcion = 0;
    int km;

    while (opcion != 8) {

      System.out.print("Elija una opción : ");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          System.out.println("¿Cuántos kilómetros quieres recorrer?");
          km = Integer.parseInt(System.console().readLine());
          bh.recorre(km);
          break;

        case 2:
          bh.hacerCaballito();
          break;

        case 3:
          System.out.println("¿Cuántos kilómetros quieres recorrer?");
          km = Integer.parseInt(System.console().readLine());
          toyota.recorre(km);
          break;

        case 4:
          toyota.quemaRueda();
          break;

        case 5:
          System.out.println("Kilometros recorridos por la bicicleta " + bh.getKiometrosRecorridos());
          break;

        case 6:
          System.out.println("Kilometros recorridos por el coche " + toyota.getKiometrosRecorridos());
          break;

        case 7:
          System.out.println("Los vehículos llevan recorrido un total de: " + Vehiculo.getKilometrosjeTotal());
          break;

        default:
          break;
      }

    }

  }

}