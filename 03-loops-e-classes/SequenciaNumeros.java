public class SequenciaNumeros {

    private int[] numeros;

    public SequenciaNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getMenor() {
        int menor = numeros[0];
        for (int num : numeros) {
            if (num < menor) menor = num;
        }
        return menor;
    }

    public int getMaior() {
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) maior = num;
        }
        return maior;
    }

    public int[] getOrdenado() {
        int[] copia = numeros.clone();
        java.util.Arrays.sort(copia);
        return copia;
    }

    public void mostrarSequencia() {
        System.out.print("Sequência digitada: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}