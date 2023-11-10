/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T04Ejercicio22 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    
    
    
    final int MINUTOSTOTALES = (6 * 24 * 60) + (15 * 60);    int diasTranscurridos = 0;

    System.out.print("Por favor, introduce un día de la seman (de lunes a viernes): ");
    String dia = sc.nextLine();


    switch (dia) {
      case "sabado":
        diasTranscurridos = 0;

        break;

      case "domingo":
        diasTranscurridos = 1;

        break;
      
      case "lunes":
        diasTranscurridos = 2;

        break;

      case "martes":
        diasTranscurridos = 3;
        break;

      case "miércoles":
      case "miercoles":
        diasTranscurridos = 4;
        break;

      case "jueves":
        diasTranscurridos = 5;
        break;

      case "viernes":
        diasTranscurridos = 6;
        break;
    
      default:
        System.out.println("No has introducido un valor correcto.");
        break;
    }
    System.out.print("Por favor introduce una hora: ");
    int horas = sc.nextInt();

    System.out.print("Por favor, introduce los minutos: ");
    int minutos = sc.nextInt();

    int minutosTranscurridos = (diasTranscurridos * 24 * 60) + (horas * 60) + minutos;
    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para el fin de semana");

    sc.close();
  }

}
