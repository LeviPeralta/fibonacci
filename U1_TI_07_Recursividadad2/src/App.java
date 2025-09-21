import java.util.Scanner;

public class App {

    public static int potencia(int a, int b) {
        if (b == 0) { 
            return 1;
        } else { 
            return a * potencia(a, b - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el valor de b: ");
        int b = sc.nextInt();

        int resultado = potencia(a, b);
        System.out.println(a + "^" + b + " = " + resultado);

        sc.close();
    }
}
