/** 
 * Muestra las tablas de multiplicar del 2, 4 y 6
 * 
* @author Pablo Ruiz
*/
public class EjemploFor02 {

  public static void main(String[] args) {

      // for (int i = 2; i <= 6; i = i + 2){

      //   for (int j = 0; j <= 10; j++){

      //     System.out.println(i + " * " + j + " = " + (i*j));

      //   }
      // }

      for (int i = 0; i < 11; i++) {
        //System.out.println("2 * " + i + " = " + i*2 + "  |  " + "4 * " + i + " = " + i*4 + "  |  " + "6 * " + i + " = " + i*6);
        System.out.printf("2 * %1$2d = %2$2d  |  4 * %1$2d = %3$2d  |  6 * %1$2d = %4$2d \n", i, (2*i), (4*i), (6*i));
      }
    }

  }