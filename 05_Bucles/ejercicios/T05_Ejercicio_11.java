/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T05_Ejercicio_11 {

  public static void main(String[] args) {

    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int i = num;
    // while (i < (num + 5)) {
    //   System.out.println(i + "  |  " + Math.pow(i, 2)+ "  |  " + Math.pow(i, 3));
    //   i++;
    // }

    for (;i < (num+5); i++) {
      //System.out.println(i + "  |  " + Math.pow(i, 2)+ "  |  " + Math.pow(i, 3));
      System.out.printf("%5d  |  %7.1f  |  %9.1f \n", i, Math.pow(i, 2), Math.pow(i, 3));
      
    }

  }
}