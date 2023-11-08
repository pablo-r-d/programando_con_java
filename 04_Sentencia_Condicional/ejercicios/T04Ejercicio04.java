import java.util.Scanner;

/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class T04Ejercicio04 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("Vamos a calcular el salario semanal en función de las horas trabajadas.");
    System.out.print("Introduce las horas que correspondan: ");
    int horas = sc.nextInt();

    int horasExtra = horas - 40;
    int sueldo;
  
    if (horasExtra > 0) {
      sueldo = (horas - horasExtra) * 12 + horasExtra * 16;
    } else {
      sueldo = horas * 12;
    }



    System.out.println("Tu sueldo semanal es: " + sueldo + "€");

    sc.close();
  }

}

