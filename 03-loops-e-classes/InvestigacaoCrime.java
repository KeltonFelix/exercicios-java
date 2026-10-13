import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadorSim = 0;
        String resposta;

        System.out.println("Responda as perguntas com 'sim' ou 'não':\n");

        System.out.print("1) Telefonou para a vítima? ");
        resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("sim")) contadorSim++;

        System.out.print("2) Esteve no local do crime? ");
        resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("sim")) contadorSim++;

        System.out.print("3) Mora perto da vítima? ");
        resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("sim")) contadorSim++;

        System.out.print("4) Devia para a vítima? ");
        resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("sim")) contadorSim++;

        System.out.print("5) Já trabalhou com a vítima? ");
        resposta = input.nextLine();
        if (resposta.equalsIgnoreCase("sim")) contadorSim++;

        String classificacao;
        if (contadorSim == 2) {
            classificacao = "Suspeita";
        } else if (contadorSim >= 3 && contadorSim <= 4) {
            classificacao = "Cúmplice";
        } else if (contadorSim == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("\nClassificação: " + classificacao);

        input.close();
    }
}