package ejercicios;

public class Disco {

  private String author;
  private String title;
  private int releaseYear;
  private String codigo = "Libre";

  // Contructor
  public Disco(String author, String title, int releaseYear, String codigo) {
    this.author = author;
    this.title = title;
    this.releaseYear = releaseYear;
    this.codigo = codigo;
  }

  // Getters y Setters

  // Autor
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // Titulo
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // Año publicación
  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  // Código
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

}
