/**
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public abstract class Animal {

  private Sexo sexo;

  public Animal() {
    sexo = Sexo.MACHO;
  }

  public Animal(Sexo s) {
    sexo = s;
  }

  public Sexo getSexo() {
    return sexo;
  }

  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }

  /**
   * Hace que el animal se eche a dormir.
   */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }
}