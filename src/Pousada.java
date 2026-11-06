import java.util.ArrayList;

public class Pousada {

    private String nome;
    private ArrayList<Acomodacao> acomodacoes;

    public Pousada(String nome) {
        this.nome = nome;
        this.acomodacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }

    public void gerarRelatorio(int diarias) {
        System.out.println("Pousada: " + nome);
        for (Acomodacao a : acomodacoes) {
            System.out.println(a.getIdentificacao() + " - R$ " + a.calcularEstadia(diarias));
        }
    }

    public double calcularTotal(int diarias) {
        if (acomodacoes.isEmpty()) {
            System.out.println("A lista de acomodacoes esta vazia.");
            return 0;
        }
        double total = 0;
        for (Acomodacao a : acomodacoes) {
            total += a.calcularEstadia(diarias);
        }
        return total;
    }
}