class ContarChar {
    public static int contar(String texto, char objetivo) {
        if (texto.isEmpty()) {
            return 0;
        }
        int contar = (texto.charAt(0) == objetivo) ? 1 : 0;
        return contar + contar(texto.substring(1), objetivo);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(ContarChar.contar("programacion", 'o')); 
        System.out.println(ContarChar.contar("aaaa", 'a')); 
        System.out.println(ContarChar.contar("", 'x')); 
    }
}
