public class GatoSergio {

  // Atributos
  String nombre;
  String raza;
  String sexo;
  int edad;
  double peso;

  // Costructores
  GatoSergio(String nombre) {
    this.nombre = nombre;
  }

  // Métodos
  void maulla() {
    System.out.println("Miaaaaau!");
  }

  void ronronea() {
    System.out.println("Brrrrrrrr");
  }

  void come(String comida) {

    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("Ñam ñam!");
    } else {
      System.out.println("Soy un gato y sólo como pescado.");
    }
  }

  void peleaCon(GatoSergio contrincate) {

    if (this.sexo.equalsIgnoreCase(contrincate.sexo) && this.sexo.equalsIgnoreCase("macho")) {
      System.out.println("Ve aquí que te revieto.");
    } else {
      System.out.println("Mo me gusta pelear.");
    }

  }
}
