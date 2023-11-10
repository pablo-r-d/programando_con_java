/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;
public class T04Ejercicio16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");

    int contador = 0;

    System.out.println("TEST DE FIDELIDAD");
    System.out.println("=================");
    System.out.println("Responde con V (verdadero) o F (falso) a cada pregunta:");

    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    String respuesta = sc.next();

    if (respuesta.equals("V")) {
      contador += 3;
    }

    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    respuesta = sc.next();

    if (respuesta == "V") {
      contador += 3;
    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    respuesta = sc.next();

    if (respuesta == "V") {
      contador += 3;
    }

    System.out.println("4. Ahora se respuesta afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    respuesta = sc.next();

    if (respuesta == "V") {
      contador += 3;
    }

    System.out.println(contador);



    sc.close();
  }

}