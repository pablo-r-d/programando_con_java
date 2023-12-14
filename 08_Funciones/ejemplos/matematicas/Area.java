package matematicas;

public class Area {

  public static double areaCuadrado(double lado) {
    return Math.pow(lado, 2);
  }

  public static double areaRectangulo(double lado1, double lado2) {
    return lado1 * lado2;
  }

  public static double areaCirculo(double radio) {
    return Math.PI * Math.pow(radio, 2);
  }

}
