/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
import java.util.Scanner;

public class ChatGPTCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        long numero = scanner.nextLong();

        if (esCapicua(numero)) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }

        scanner.close();
    }

    // Función para verificar si un número es capicúa
    public static boolean esCapicua(long numero) {
        long original = numero;
        long invertido = 0;

        while (numero > 0) {
            long digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return original == invertido;
    }
}






