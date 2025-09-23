
import java.util.ArrayList;
import java.util.List;

public class App {

    private List<String> materias = new ArrayList<>();

    public void agregar(String materia){
        materias.add(materia);
    }

    public boolean contiene(String materia){
        for (String m : materias) {
            if(m.equals(materia)){
                return true;
            }
        }
        return false;
    }    

    public void imprimir(){
        System.out.println("Materias: " + materias);
    }

    public static void main(String[] args) throws Exception {
        App lista = new App();

        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Programación");
        lista.agregar("Cálculo");
        lista.agregar("Estructura de Datos");

        lista.imprimir();

        String buscar = "web";
        System.out.println("La materia buscada: " + buscar);

        if(lista.contiene(buscar)){
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado: Materia NO encontrada");
        }
    }
}
