public class Alumno {

  // Atributos
  private String nombre;
  private double notaMedia = 0.00;

  // Constructor
  // public Alumno(String nombre, double notaMedia) {
  //   this.nombre = nombre;
  //   this.notaMedia = notaMedia;
  // }

  // toString
  @Override
  public String toString() {
    return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getNotaMedia() {
    return notaMedia;
  }

  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }

}
