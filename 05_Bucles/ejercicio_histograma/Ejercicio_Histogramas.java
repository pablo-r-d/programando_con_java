/** 
 * Explica tu código aquí
 * 
* @author Pablo Ruiz
*/
public class Ejercicio_Histogramas {

    public static void main(String[] args) {
  
        int num = 1;
        double num1 = 0;
        int i = 0;
        int columnas=1;

        System.out.println("Introduzca un número entre 0 y 9 y pulse INTRO. Introduzca un número negativo si desea parar.");

        while (num >= 0) {
            num = Integer.parseInt(System.console().readLine());
            if (num>=0) {
                num1 = num1 + (num * Math.pow(10, i));
                i++;
                System.out.println(num1);
                // System.out.println(i); 
            }
            
            if (num > columnas) {
                columnas = num + 1;
            }
        }
        
        while (num1 >= 1) {
            
            int numero = (int)(num1 % 10);
            // System.out.println(numero);
            
            for (int j = columnas; j >= 0; j--) {
                System.out.print(" ---");
            }
            
            System.out.println();
            
            int cifra = numero+1;

            for (int j = columnas; j >= 0; j--) {
                if (cifra == (numero+1)) {
                    System.out.printf("| %d ", numero);
                } else if (cifra > 0) {
                    System.out.print("| * ");
                } else {
                    System.out.print("|   ");
                }
                cifra--;
            }
            System.out.println("|");
            
            num1 = ((num1 - (num1 % 10)) / 10);
        }

        for (int j = columnas; j >= 0; j--) {
                System.out.print(" ---");
        } 
    }  
}