/* 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */
public class Disco {

  // Atributos
  private String artist;
  private String title;
  private int releaseYear;
  private int duration;
  private String codigo = "Libre";

  // Constructor
  public Disco(String artist, String title, int releaseYear, int duration, String codigo) {
    this.artist = artist;
    this.title = title;
    this.releaseYear = releaseYear;
    this.duration = duration;
    this.codigo = codigo;
  }

  // Getters and Setters
  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

}