import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        Arbol arbol = new Arbol();
       
        System.out.println("¿Desea ingresar un árbol de números o letras? (Ingrese 'numeros' o 'letras')");
        String OP = tc.nextLine();

        while (true) {
            System.out.println("Ingrese un valor (o 'fin' para terminar): ");
            String entrada = tc.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                if (OP.equalsIgnoreCase("numeros")) {
                    int valor = Integer.parseInt(entrada);
                    arbol.insertar(valor);
                } else if (OP.equalsIgnoreCase("letras")) {
                    String valor = entrada;
                    arbol.insertar(valor);
                } else {
                    System.out.println("Opción no válida. Por favor, ingrese 'numeros' o 'letras'.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la opción 'numeros'.");
            }
        }
        
        System.out.println("In-Orden");
        arbol.ordenInOrden();
        System.out.println("");
        System.out.println("Pre-Orden");
        arbol.ordenPreOrden();
        System.out.println("");
        System.out.println("Post-Orden");
        arbol.ordenPostOrden();
        System.out.println("");
        System.out.println("Grado del árbol: " + arbol.Grado());

        System.out.println("Ingrese un valor para calcular su nivel: ");
        String valorBuscado = tc.nextLine();
        System.out.println("Nivel del nodo " + valorBuscado + ": " + arbol.CalcularNivel( valorBuscado));

        System.out.println("Altura del árbol: " + arbol.CalcularAltura());
    }
}
