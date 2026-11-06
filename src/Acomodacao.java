public class Acomodacao {

    private String identificacao;
    private double valorDiaria;

    public Acomodacao(String identificacao, double valorDiaria) {
        this.identificacao = identificacao;
        this.valorDiaria = valorDiaria;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularEstadia(int diarias) {
        if (diarias <= 0) {
            System.out.println("Erro: a quantidade de diarias deve ser maior que zero.");
            return 0;
        }
        return valorDiaria * diarias;
    }
}