/**
 * Clase de ejemplo Coche
 * 
 * @author Pablo Ruiz
 */

public class Coche {

  // Atributos o Propiedades
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    // Nombre_clase (UCC) nombre_objeto(lCC) = new Nombre_clase();
    Coche miCoche = new Coche(); // Constructor por defecto. Método que crea objetos de una clase. Al
                                 // tener los paréntesis vacíos no rellena ningún atributo.
    Coche tuCoche = new Coche();

    miCoche.matricula = "1234ABC";

    System.out.println("Matricula del coche 1: " + miCoche.matricula);
    System.out.println("Potencia del coche 1: " + miCoche.potencia);
    System.out.println("Matricula del coche 2: " + tuCoche.matricula);
    System.out.println("Potencia del coche 2: " + tuCoche.potencia);

  }

}