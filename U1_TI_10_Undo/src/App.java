import java.util.Stack;

public class App {

    private Stack<String> acciones = new Stack<>();
    private Stack<String> rehacer = new Stack<>();

    public void hacer(String accion){
        acciones.push(accion);
        rehacer.clear();
    }


    public String deshacer(){
        if(!acciones.isEmpty()){
            String ultima = acciones.pop();
            rehacer.push(ultima);
            System.out.println("Deshacer -> mueve " + ultima + " a rehacer");
            return ultima;
        }
        System.out.println("La palabra es null");
        return null;
        
    }

    public String rehacer() {
        if (!rehacer.isEmpty()) {
            String ultima = rehacer.pop();
            acciones.push(ultima);
            System.out.println("Rehacer -> recupera " + ultima );
            return ultima;
        }
        return null;
    }


    public void imprimir() {
        System.out.println("Acciones: " + acciones);
    }


    public static void main(String[] args) throws Exception {
        App historial = new App();

        historial.hacer("hola");
        historial.hacer("Borrar palabra");
        historial.hacer("Escribir mundo");
        historial.imprimir();


        historial.deshacer();
        historial.deshacer();

        historial.rehacer();

        historial.imprimir();

    }
}
