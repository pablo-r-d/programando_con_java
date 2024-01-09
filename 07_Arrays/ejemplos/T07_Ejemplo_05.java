/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class T07_Ejemplo_05 {

  public static void main(String[] args) {

    double[] notas = new double[3];
    double media;
    double suma = 0;

    // Escritura en el array
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      notas[i] = Double.parseDouble(System.console().readLine());
    }

    // Lectura del array
    System.out.println("Tus notas son: ");
    for (double d : notas) {
      System.out.print(d + "\t"); // \t es tabulador
      suma += d;
    }

    media = suma / notas.length;
    System.out.println("Tus nota media es: " + media);
  }
}