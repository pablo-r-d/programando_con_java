/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
*/
public class BarajaPrueba {

  public static void main(String[] args) {

   
    Baraja baraja = new Baraja();
    for (int i; i < 4; i++) {
      for (int j; j < 41; j++) {
        System.out.println(baraja[i][j]);
      }
    }
    
    

  }

}