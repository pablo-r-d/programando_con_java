/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/

public class EjemploVariable01 {
  public static void main(String[] args) {
    // Tipo byte
    byte miNumByte = 100;
    System.out.println(miNumByte);

    // Tipo short
    short miNumShort = 5000;
    System.out.println(miNumShort);

    // Tipo long
    long miNumLong = 150000000L;
    System.out.println(miNumLong);

    // Tipo float
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);

    // Tipo boolean
    boolean esJavaDivertido = true;
    System.out.println(esJavaDivertido);
    
    // Concatenación de diferentes tipos de variables
    int numero = 5;
    System.out.println("El valor de una variable es " + numero);

    double x;
    double y;
    x = 7;
    y = 25.75;
    System.out.println("x vale " + x);
    System.out.println("y vale " + y);

    char letra1 = 'c';
    char letra2 = 'a';
    char letra3 = 99;
    System.out.println(letra1 + letra2);
    System.out.println("" + letra1 + letra2); // el "" no puede estar al final. Al ppio o en medio
    System.out.println(letra3);

    
  }
}
