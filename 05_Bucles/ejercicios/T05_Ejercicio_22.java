/** 
 * Muestra por pantalla todos los números primos entre 2 y 100 incluidos
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_22 {

  public static void main(String[] args) {

    boolean primo = true;

    for (int i = 2; i < 101; i++) {
      
      int j = 2;

      while (primo == true) {
        if (i % j == 0 && j != i) {
          primo = false;
        }
        j++;
      }
      

      if (primo == true) {
        System.out.println(i + " es primo.");
      }
    }
  }
}