import matematicas.Varias;
import matematicas.Volumen;

public class PruebaFunciones {

  public static void main(String[] args) {
    int n;

    // Probamos la funcion esPrimo(), alojada en la clase Varias dentro del paquete
    // matematicas
    System.out.print("Introduce un número entero: ");
    n = Integer.parseInt(System.console().readLine());

    if (Varias.esPrimo(n)) {
      System.out.println("El número " + n + " es primo.");
    } else {
      System.out.println("El número " + n + " no es primo.");
    }

    // Prueba digitos(), alojada en la clase Varias dentro del paquete matematicas
    System.out.print("Introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());

    int numDigitos = Varias.digitos(num);
    System.out.println(num + " tiene " + numDigitos + " dígitos.");

    double r;
    double h;

    System.out.print("Introduzca el radio del cilindro: ");
    r = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzca la altura del cilindro: ");
    h = Double.parseDouble(System.console().readLine());

    System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r, h));
  }

}
