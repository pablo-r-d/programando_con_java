/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T10_Ejercicio_04 {

  public static void main(String[] args) {

    int[] num = new int[5];
    int[] cuadrado = new int[5];
    int[] cubo = new int[5];

    for (int j = 0; j < num.length; j++) {

      num[j] = (int) (Math.random() * 10);

    }
    for (int i = 0; i < cuadrado.length; i++) {
      cuadrado[i] = (int) Math.pow(num[i], 2);
    }

    for (int i = 0; i < cubo.length; i++) {
      cubo[i] = (int) Math.pow(num[i], 3);
    }

    for (int i = 0; i < cubo.length; i++) {
      System.out.println("Numero    Cuadrado    Cubo");
      System.out.println(num[i] + "         " + cuadrado[i] + "           " + cubo[i]);
    }

  }

}