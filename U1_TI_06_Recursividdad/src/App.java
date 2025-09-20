import java.util.Scanner;

public class App {

    public static int suma(int n) {
        if (n == 0) { 
            System.out.print("0"); 
            return 0;
        } else {
            System.out.print(n + " + ");
            return n + suma(n - 1); 
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();

        System.out.print("suma(" + n + ") = ");
        int resultado = suma(n);

        System.out.println(" = " + resultado); 
        
        sc.close();
    }
}
