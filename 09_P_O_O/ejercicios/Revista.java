package ejercicios;

public class Revista extends Publicacion {

  int numero;

  public int getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    return super.toString() + "Revista [numero=" + numero + "]";
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Revista(String isbn, String titulo, int anoPublicacion, int numero) {
    super(isbn, titulo, anoPublicacion);
    this.numero = numero;
  }
}
