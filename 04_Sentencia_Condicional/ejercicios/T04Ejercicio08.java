/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T04Ejercicio08 {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por último introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);

    if (media < 5) {
      System.out.println("Insuficiente");
    } else if (media < 6) {
      System.out.println("Suficiente");
    } else if (media < 7) {
      System.out.println("Bien");
    } else if (media < 9) {
      System.out.println("Notable");
    } else {
      System.out.println("Sobresaliente");
    }

  }

}