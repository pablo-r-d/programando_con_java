/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejemplo_03 {

  public static void main(String[] args) {

    int[] num = new int[10];

    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * 10);
    }

    num[6] = num[2];

    for (int i : num) {
      System.out.println(i);
    }

  }

}