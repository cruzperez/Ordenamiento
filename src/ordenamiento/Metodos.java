package ordenamiento;

public class Metodos {

    private int[] notas = new int[]{5, 8, 1, 9, 2, 7, 6, 3, 4, 0};

    public void ordenarBurbuja() {
        int temp = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length - 1; j++) {
                if (notas[j] > notas[j + 1]) {
                    temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarQuicksort(int izq, int der) {
        int pivote = notas[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (notas[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (notas[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = notas[i];                  // los intercambia
                notas[i] = notas[j];
                notas[j] = aux;
            }
        }
        notas[izq] = notas[j]; // se coloca el pivote en su lugar de forma que tendremos
        notas[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            ordenarQuicksort(izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            ordenarQuicksort(j + 1, der); // ordenamos subarray derecho
        }
    }

    public void imprimir() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

}
