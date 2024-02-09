package ejercicios;

public class Libro extends Publicacion implements Prestable {

  boolean prestado;

  @Override
  public boolean estaPrestado() {
    return prestado;
  }

  @Override
  public void devuelve() {
    this.prestado = false;
  }

  @Override
  public void presta() {
    this.prestado = true;
  }

  @Override
  public String toString() {
    return super.toString() + " prestado = " + prestado + "]";
  }

  public Libro(String isbn, String titulo, int anoPublicacion) {
    super(isbn, titulo, anoPublicacion);
    this.prestado = false;
  }

}
