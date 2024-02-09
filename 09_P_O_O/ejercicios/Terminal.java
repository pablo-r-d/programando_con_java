/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
*/

package ejercicios;

public class Terminal {

  // Atributos
  private String numero;
  private int tiempoConversacion; // en segundos

  // Constructores
  public Terminal(String numero) {
    this.numero = numero;
  }

  // Metodos
  public void llama(Terminal t, int tiempoConversacion) {
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion + " segundos de conversación";
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

}