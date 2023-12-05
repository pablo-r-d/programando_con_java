/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class try_catch_T05_Ejercicio_14 {

  public static void main(String[] args) {

    int base;
    int exp;

    try {
      System.out.print("Introduce un número: ");
      base = Integer.parseInt(System.console().readLine());

      System.out.print("Introduce un número: ");
      exp = Integer.parseInt(System.console().readLine());

      System.out.println(Math.pow(base, exp));

    } catch (Exception e) {
      System.out.println("No se puede calcular la potencia.");
      System.out.println("Los datos introducidos no son correctos");
    } finally {
      System.out.println("Gracias por utilizar este programa.");
    }
  }
}
