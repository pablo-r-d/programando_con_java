/** 
 * Calculadora días a años, meses, días
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class Problema05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("CALCULADORA DE TIEMPO");
    System.out.println("=====================");

    System.out.print("Introduce una cantidad de días: ");
    int dias = sc.nextInt();
    
    int years = dias / 365;

    int months = (dias % 365) / 30;

    int diasf = (dias % 365) % 30;

    System.out.printf("%d días son \033[48;5;160m%d años\033[0m, \033[48;5;214m%d meses\033[0m y \033[48;5;70m%d días\033[0m.", dias, years, months, diasf);
    
    sc.close();
  }

}