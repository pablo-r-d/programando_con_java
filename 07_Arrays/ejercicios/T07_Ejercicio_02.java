/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T07_Ejercicio_02 {

  public static void main(String[] args) {
  
    char[] simbolo = new char[10];

    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[9] = 'Q';

    for (int i : simbolo) {
      System.out.println(i);
    }
    
    for (int j = 0; j < 10; j++) {
      System.out.println("simbolo[" + j + "]: " + simbolo[j]);
      }
      

  }

}