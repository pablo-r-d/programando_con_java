/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Prueba {

  public static void main(String[] args) {

    int num[] = ArrayRandom();

    for (int d : num) {
      System.out.println(d);
    }

  }

  public static int[] ArrayRandom() {

    System.out.println("Escribe el límite inferior (incluido) del rango de los números aleatorios");
    int limiteInferior = Integer.parseInt(System.console().readLine());

    System.out.println("Escribe el límite superior (incluido) del rango de los números aleatorios");
    int limiteSuperior = Integer.parseInt(System.console().readLine());

    System.out.println("¿Cuántos números quieres obtener?");
    int longitud = Integer.parseInt(System.console().readLine());
    int[] num = new int[longitud];

    for (int i = 0; i < longitud; i++) {
      num[i] = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
    }

    return num;

  }

}