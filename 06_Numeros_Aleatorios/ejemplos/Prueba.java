/**
 * Voy a tratar de hacer una función que pregunte entre qué numeros enteros
 * quieres obtener números aleatorios y cuántos quieres. Salen guardados en un
 * array monodimensional.
 * 
 * @author Pablo Ruiz
 */
public class Prueba {

  public static int[] ArrayRandom(
    // int limiteInferior, int limiteSuperior, int longitud
    ) {

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