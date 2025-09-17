import java.util.Scanner;

public class App {

    static int fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números de la serie quieres mostrar? ");
        int x = sc.nextInt();
        for(int i=0; i<x; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
