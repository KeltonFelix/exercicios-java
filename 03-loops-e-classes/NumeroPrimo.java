import java.util.Scanner;

public class NumeroPrimo {

    static boolean ehPrimo(long n) {
        if (n < 2) return false;

        long i = 2;
        while (i < n) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long numero = entrada.nextLong();

        if (ehPrimo(numero))
            System.out.println(numero + " é primo!");
        else
            System.out.println(numero + " não é primo!");

        entrada.close();
    }
}