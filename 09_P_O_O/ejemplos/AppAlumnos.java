/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

public class AppAlumnos {

  public static void main(String[] args) {

    Alumno[] alumnos = new Alumno[5];
    // String nombre;
    double notaMedia;

    // Creamos un nuevo alumno en la primera posición del array
    // alumnos[0] = new Alumno();

    // Creación de los objetos Alumno
    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.println("Nombre del alumno " + i + ": ");
      // nombre = System.console().readLine();
      alumnos[i].setNombre(System.console().readLine());

      System.out.println("Nota de " + alumnos[i].getNombre() + ": ");
      alumnos[i].setNotaMedia(Double.parseDouble(System.console().readLine()));
    }

    for (Alumno alumno : alumnos) {
      System.out.println(alumno);
    }

    // for (int i = 0; i < alumnos.length; i++) {
    //   System.out.println(alumnos[i]);
    // }
  }

}