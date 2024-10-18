package entidade;

public class PessoaFisica implements Imposto{
    private double rendaAnual;

    public PessoaFisica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public double calcularImposto() {
        double imposto = (rendaAnual/100)*20;
        return imposto;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

}
