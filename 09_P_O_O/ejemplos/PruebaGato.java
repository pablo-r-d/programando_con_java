public class PruebaGato {
  
  public static void main(String[] args) {
    
    Gato garfield = new Gato("Garfield");
    System.out.println(garfield.nombre);
    
    Gato botas = new Gato(null);

    garfield.come("escado");
    garfield.maulla();
    garfield.ronronea();
    
  }

}
