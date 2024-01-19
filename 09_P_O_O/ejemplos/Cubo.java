public class Cubo {

  // Atributos
  private int capacidad; // Capacidad máxima en litros
  private int contenido; // Contenido actual en litros

  // Constructor
  Cubo(int cap) {
    this.capacidad = cap;
  }

  // Getters

  public int getCapacidad() {
    return this.capacidad;
  }

  public int getContenido() {
    return this.contenido;
  }

  // Setters
  public void setContenido(int litros) {
    this.contenido = litros;
  }

  @Override
  public String toString() {
    return "Cubo [capacidad = " + capacidad + ", contenido = " + contenido + "]";
  }

  // Métodos
  public void vacia() {
    this.contenido = 0;
  }

  public void llena() {
    this.contenido = this.capacidad;
  }

  public void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
      if (this.contenido >= nivel) {
        System.out.println("#~~~~#");
      } else {
        System.out.println("#    #");
      }
    }
    System.out.println("######");
  }

  /*
   * Vuelca el contenido de un cubo sobre otro.
   * Antes de echar el agua se comprueba cuánto le cabe al
   * cubo destino.
   */
  void vuelcaEn(Cubo destino) {
    int libres = destino.getCapacidad() - destino.getContenido();
    if (libres > 0) {
      if (this.contenido <= libres) {
        destino.setContenido(destino.getContenido() + this.contenido);
        this.vacia();
      } else {
        this.contenido -= libres;
        destino.llena();
      }
    }
  }

  // public void setCapacidad(int capacidad) {
  // this.capacidad = capacidad;
  // }

}
