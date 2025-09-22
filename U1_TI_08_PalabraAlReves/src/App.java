import java.util.Scanner;

public class App {

    public static void invertir(String cadena) {
        if (cadena.length() == 0) { 
            return;
        } else {
            System.out.print(cadena.charAt(cadena.length() - 1));
            invertir(cadena.substring(0, cadena.length() - 1));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String texto = sc.nextLine();

        System.out.print("Invertida: ");
        invertir(texto); 
        System.out.println(); 

        sc.close();
    }
}
