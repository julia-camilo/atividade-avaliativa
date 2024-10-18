package entidade;

public class PessoaJuridica implements Imposto{
    private double rendaAnual;

    @Override
    public double calcularImposto() {
        double imposto = (rendaAnual/100)*10;
        return imposto;
    }

    public PessoaJuridica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
}
