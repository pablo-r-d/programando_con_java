package matematicas;

public class Volumen {

  /**
   * Calcula el volumen de un cilindro.
   * Tanto el radio como la altura se deben proporcionar en las
   * mismas unidades para que el resultado sea congruente.
   * 
   * @param r radio del cilindro
   * @param h altura del cilindro
   * @return double volumen del cilindro
   */
  public static double volumenCilindro(double r, double h) {
    return Math.PI * r * r * h;
  }

  public static double volumenCubo(double lado) {
    return Math.pow(lado, 3);
  }

  public static double volumenCono(double radio, double altura) {
    return (Math.PI * Math.pow(radio, 2) * altura) / 3;
  }

  public static double volumenPrismaRectangular(double lado1, double lado2, double lado3) {
    return lado1 * lado2 * lado3;
  }

}