/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;
public class T04Ejercicio01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    System.out.println("Introduce un día de la semana para ver qué asignatura toca ese día a primera hora: ");
    String dia = sc.next();

    switch (dia) {
      case "Lunes", "lunes":
        System.out.println("FOL");
        break;
      
      case "Martes", "martes", "Viernes", "viernes":
        System.out.println("Programación");
        break;

      case "Miércoles", "miércoles", "Miercoles", "miercoles":
        System.out.println("Entornos de desarrollo");
        break;
      
      case "Jueves", "jueves":
        System.out.println("Bases de datos");
        break;

      case "sabado":
        //System.out.println("¡El fin de semana no hay clases!");
       // break;
       // al no haber código aquí ejecuta el código de la siguiente opción

      case "Domingo":
        System.out.println("¡El fin de semana no hay clases!");
        break;

      default:
      System.out.println("Parece que no has introducido un día válido");
        break;
    }

    sc.close();
  }

}