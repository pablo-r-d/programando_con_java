/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Pinguino extends Ave {
  public Pinguino() {
    super();
  }

  public Pinguino(Sexo s) {
    super(s);
  }

  /**
   * El pingüino se siente triste porque no puede volar.
   * Programación orientada a objetos 180
   */
  @Override
  public void vuela() {
    System.out.println("No puedo volar");
  }
}