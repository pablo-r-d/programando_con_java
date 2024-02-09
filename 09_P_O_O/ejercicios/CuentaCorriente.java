/** 
 * Ejercicio 13
 * 
 * @author Pablo Ruiz
*/

package ejercicios;

public class CuentaCorriente {

  private int numeroCuenta;
  private double saldo = 0;

  public CuentaCorriente(double saldo) {
    this.saldo = saldo;
    generarAleatorio();
  }

  public CuentaCorriente() {
    generarAleatorio();
  }

  private void generarAleatorio() {
    for (int i = 0; i < 3; i++) {
      numeroCuenta = ((int) (Math.random() * 3));
    }
  }

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void ingreso(double dinerito) {
    setSaldo(this.saldo += dinerito);
  }

  public void gasto(double dinerito) {
    setSaldo(this.saldo -= dinerito);
  }

  public void transferencia(CuentaCorriente recipiente, double dinerito) {
    // recipiente.setSaldo(recipiente.saldo + dinerito);
    recipiente.saldo += dinerito; // No hace falta el setter por estar dentro de la propia clase
    this.saldo -= dinerito;
  }

  @Override
  public String toString() {
    return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
  }

}
