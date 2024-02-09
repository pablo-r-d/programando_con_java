
/** 
 * Explica tu código aquí
 * 
 * @author Pablo Ruiz
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import java.lang.Object;
import org.jsoup.nodes.Element;

public class Configuracion {

  public void saveToXML(String xml) {
    Document dom;
    Element e = null;
    // get an instance of factory
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    try {
      // using a factory get an instance of document builder
      DocumentBuilder db = dbf.newDocumentBuilder();
      // create an instance of DOM
      dom = db.newDocument();
      // create the root element
      Element rootElement = dom.createElement("myparameters");
      // create data elements and place them under root
      e = dom.createElement("brightness");
      e.appendChild(dom.createTextNode(brightness));
      rootElement.appendChild(e);

    } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
      System.out.println("No se encuentra el fichero conf.txt");
    } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
      System.out.println("No se puede leer el fichero conf.txt");
    }
  }
}

// public static void getConfPuntuacion() {
// Interfaz interfaz = new Interfaz();

// try {
// BufferedReader br = new BufferedReader(new FileReader("conf.txt"));
// String linea="";
// while (linea != null) {
// linea = br.readLine();
// int longitud = linea.length();

// if (linea.charAt((longitud-1)) == 's') {
// interfaz.setMostrarPuntuacion(true);
// } else if (linea.charAt((longitud-1)) == 'n') {
// interfaz.setMostrarPuntuacion(false);
// } else {
// break;
// }

// }

// br.close();
// } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el
// fichero
// System.out.println("No se encuentra el fichero conf.txt");
// } catch (IOException ioe) { // qué hacer si hay un error en la lectura del
// fichero
// System.out.println("No se puede leer el fichero conf.txt");
// }
// }
