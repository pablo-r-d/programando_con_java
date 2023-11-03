import java.util.Scanner;

public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cantidad de Kb para convertilo a Mb");
    float Kb = sc.nextFloat();

    System.out.println("La cantidad introducida equivale a " + Kb/1000 + " Mb");



    sc.close();
  }
}
