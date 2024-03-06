package clases;

/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

public class Clinica {

  private Mascota[] listado = new Mascota[100];
  int contador = 0;

  public boolean esVacia() {
    if (listado == null) {
      return true;
    } else {
      return false;
    }
  }

  public boolean esLlena() { // No entiendo por qué da error
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] == null) {
        return false;
      }
    }
    return true;
  }

  public int totalPerros() {
    return Perro.getTotalPerros();
  }

  public int totalGatos() {
    return Gato.getTotalGatos();
  }

  public int totalMascotas() {
    return Mascota.getTotalMascotas();
  }

  public Mascota buscarChip(String chip) {

    for (int i = 0; i < listado.length; i++) {
      if (listado[i].getChip().equals(chip)) {
        return listado[i];
      }
    }
    return null;
  }

  public void agregar(Mascota mascota) { // Entendí que había que crear la mascota también, no vi que estaba en el main...
    while (listado[contador] != null) {
      contador++;
    }
    listado[contador] = mascota;

    // String respuesta;
    // String nombre;
    // System.out.println("¿Tiene nombre? (s/n)");
    // respuesta = System.console().readLine();
    // System.out.println("¿Perro o gato?");

    // if (respuesta.equals("s")) {
    // respuesta = System.console().readLine();
    // if (respuesta.equals("gato")) {
    // System.out.println("¿Chip del gato?");
    // respuesta = System.console().readLine();
    // System.out.println("¿Nombre del gato?");
    // nombre = System.console().readLine();
    // listado[contador] = new Gato(respuesta, nombre);
    // } else if (respuesta.equals("perro")) {
    // System.out.println("¿Chip del perro?");
    // respuesta = System.console().readLine();
    // System.out.println("¿Nombre del perro?");
    // nombre = System.console().readLine();
    // listado[contador] = new Perro(respuesta, nombre);
    // }

    // } else if (respuesta.equals("n")) {
    // if (respuesta.equals("gato")) {
    // System.out.println("¿Chip del gato?");
    // respuesta = System.console().readLine();
    // listado[contador] = new Gato(respuesta);
    // } else if (respuesta.equals("perro")) {
    // System.out.println("¿Chip del perro?");
    // respuesta = System.console().readLine();
    // listado[contador] = new Perro(respuesta);
    // }
    // }

  }

  public void listar() {
    for (Mascota mascota : listado) {
      if (mascota != null) { // Es necesario comprobar que no sea null para evitar errores al ejecutar
        System.out
            .println("[" + mascota.getChip() + "]: " + mascota.getNombre() + ", edad " + mascota.getEdad() + " años");
      }
    }
  }

}
