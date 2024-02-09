package ejercicios;

public class Publicacion {

  String isbn;

  @Override
  public String toString() {
    return "Publicacion [isbn=" + isbn + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + "]";
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAnoPublicacion() {
    return anoPublicacion;
  }

  public void setAnoPublicacion(int anoPublicacion) {
    this.anoPublicacion = anoPublicacion;
  }

  String titulo;
  int anoPublicacion;

  public Publicacion(String isbn, String titulo, int anoPublicacion) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anoPublicacion = anoPublicacion;
  }
}
