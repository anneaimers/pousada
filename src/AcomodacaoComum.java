public class AcomodacaoComum extends Acomodacao {

    public AcomodacaoComum(String identificacao, double valorDiaria) {
        super(identificacao, valorDiaria);
    }

    @Override
    public double calcularEstadia(int diarias) {
        return super.calcularEstadia(diarias);
    }
}