/**
 * La clase que contendrá el método principal o main
 * 
 * @author Pablo Ruiz
 */
public class PruebaLibro {

  public static void main(String[] args) {

    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Franck ";
    lib.numPaginas = 490;
    System.out.println("ISBN: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("úmero de páginas: " + lib.numPaginas);
    // System.out.println("Edición: " + lib.edicion);

  }

}