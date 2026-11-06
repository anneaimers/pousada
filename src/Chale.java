public class Chale extends Acomodacao {

    private double taxaLimpeza;

    public Chale(String identificacao, double valorDiaria, double taxaLimpeza) {
        super(identificacao, valorDiaria);
        this.taxaLimpeza = taxaLimpeza;
    }

    public double getTaxaLimpeza() {
        return taxaLimpeza;
    }

    @Override
    public double calcularEstadia(int diarias) {
        if (diarias <= 0) {
            return super.calcularEstadia(diarias);
        }
        return (getValorDiaria() * diarias) + taxaLimpeza;
    }
}