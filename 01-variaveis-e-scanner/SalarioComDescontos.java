import java.util.Scanner;

public class SalarioComDescontos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ganhaporhora, horasTrabalhadasmes, salariobruto, inss, impostorenda, sindicato, salarioliquido;

        System.out.println("Quanto você ganha por hora?");
        ganhaporhora = entrada.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        horasTrabalhadasmes = entrada.nextDouble();

        salariobruto = ganhaporhora * horasTrabalhadasmes;
        inss = salariobruto * 0.08;
        impostorenda = salariobruto * 0.11;
        sindicato = salariobruto * 0.05;
        salarioliquido = salariobruto - inss - impostorenda - sindicato;

        System.out.printf("Seu salário bruto é: R$ %.2f%n", salariobruto);
        System.out.printf("Você pagou R$ %.2f de INSS.%n", inss);
        System.out.printf("Você pagou R$ %.2f de Sindicato.%n", sindicato);
        System.out.printf("Você pagou R$ %.2f de Imposto de Renda.%n", impostorenda);
        System.out.printf("Seu salário líquido é: R$ %.2f%n", salarioliquido);

        entrada.close();
    }
}