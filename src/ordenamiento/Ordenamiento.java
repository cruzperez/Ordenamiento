package ordenamiento;

public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos orden = new Metodos();
        //orden.ordenarBurbuja();
        orden.imprimir();
        orden.ordenarQuicksort(0, 9);
        orden.imprimir();
    }
    
}
