public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Kelton", 20);
        Pessoa p2 = new Pessoa("Maria", 25);

        p1.fazerAniversario();
        p2.fazerAniversario();

        System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos.");
        System.out.println(p2.getNome() + " tem " + p2.getIdade() + " anos.");
    }
}