public class PruebaGato {

  public static void main(String[] args) {

    System.out.println("¿Cuántos gatos quieres crear?");
    int numGatos = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[numGatos];
    String[] nombres = { "Garfield", "Botas", "Willy", "Pancho", "Misifú" };
    String[] colores = { "Marrón", "negro", "Pardo" };

    for (int i = 0; i < numGatos; i++) {

      System.out.println("¿Qé raza desea?");
      String raza = System.console().readLine();
      int nombreAleatorio = (int) (Math.random() * 5);
      int colorAleatorio = (int) (Math.random() * 3);
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0); //Falta el constructor en la clase Gato.java
    }

    Gato garfield = new Gato("Garfield");
    System.out.println(garfield.nombre);

    Gato botas = new Gato(null);

    garfield.come("escado");
    garfield.maulla();
    garfield.ronronea();

  }

}
