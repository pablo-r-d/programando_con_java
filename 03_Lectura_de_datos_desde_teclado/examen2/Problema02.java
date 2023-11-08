/** 
 * Volumen de un tronco de cono
 * 
* @author Pablo Ruiz
*/

import java.util.Scanner;
public class Problema02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\033[1mVOLUMEN DE UN TRONCO DE CONO");
    System.out.println("===========================");
    System.err.print("\033[0m");
    
    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    double radioMayor = sc.nextDouble();

    System.out.print("Introduzca el radio de la bade menor r (cm): ");
    double radioMenor = sc.nextDouble();

    System.out.print("Introduzca la altura h (cm): ");
    double altura = sc.nextDouble();

    double volumen = (1.0/3.0) * Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + (radioMayor * radioMenor));

    System.out.printf("El volumen del toroide es de" + "\033[38;5;160m %.4f " + "cm\u00B3\033[0m.", volumen);

    sc.close();

  }

}