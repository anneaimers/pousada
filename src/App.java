public class App {

    public static void main(String[] args) {

        Pousada pousada = new Pousada("Pousada Olaria");

        pousada.adicionarAcomodacao(new AcomodacaoComum("01", 100));
        pousada.adicionarAcomodacao(new Suite("02", 100, 40));
        pousada.adicionarAcomodacao(new Chale("03", 100, 60));

        System.out.println("--- Relatorio para 2 diarias ---");
        pousada.gerarRelatorio(2);
        System.out.println("Total: R$ " + pousada.calcularTotal(2));

        System.out.println("--- Teste: zero diarias ---");
        pousada.gerarRelatorio(0);

        System.out.println("--- Teste: diarias negativas ---");
        pousada.gerarRelatorio(-3);

        System.out.println("--- Teste: pousada sem acomodacoes ---");
        Pousada vazia = new Pousada("Pousada Sem Acomodacoes");
        System.out.println("Total: R$ " + vazia.calcularTotal(2));
    }
}