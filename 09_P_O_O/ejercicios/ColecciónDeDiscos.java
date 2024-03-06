/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

package ejercicios;

import java.util.ArrayList;

public class ColecciónDeDiscos {

  // Funciones CRUD (Create Read Update Delete)

  // Sé que esto es código duplicado innecesariamente, pero quiero
  // poder ver todas las funciones de CRUD aquí
  public Disco crearDisco(String author, String title, int releaseYear, String codigo) {
    return new Disco(author, title, releaseYear, codigo);
  } // Create listo

  public void updateDisco(Disco disco, String author, String title, int releaseYear, String codigo) {
    disco.setAuthor(author);
    disco.setCodigo(codigo);
    disco.setReleaseYear(releaseYear);
    disco.setTitle(title);
  } // Update listo

  public void readDisco(){

  }

  public void deleteDisco(Disco disco){
    // disco.setAuthor(null);
    disco.setCodigo("Libre");
    // disco.setReleaseYear(0);
    // disco.setTitle(null);
  }


  public static void main(String[] args) {

    ArrayList<Disco> coleccion = new ArrayList<Disco>();
    String codigo;
    // Borrar disco
    for (Disco disco : coleccion) {
      if (disco.getCodigo().equals("Libre")) {
        coleccion.remove(disco);
      }
    }

  }

}
