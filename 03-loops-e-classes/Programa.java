import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        SequenciaNumeros seq = new SequenciaNumeros(numeros);

        seq.mostrarSequencia();

        System.out.println("Menor número: " + seq.getMenor());
        System.out.println("Maior número: " + seq.getMaior());

        System.out.print("Sequência ordenada: ");
        for (int num : seq.getOrdenado()) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}