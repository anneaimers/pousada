public class Suite extends Acomodacao {

    private double adicionalConforto;

    public Suite(String identificacao, double valorDiaria, double adicionalConforto) {
        super(identificacao, valorDiaria);
        this.adicionalConforto = adicionalConforto;
    }

    public double getAdicionalConforto() {
        return adicionalConforto;
    }

    @Override
    public double calcularEstadia(int diarias) {
        if (diarias <= 0) {
            return super.calcularEstadia(diarias);
        }
        return (getValorDiaria() + adicionalConforto) * diarias;
    }
}