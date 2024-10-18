package entidade;
import java.util.ArrayList;

public class CalculadoraImposto implements Imposto {
    public static void main(String[] args) {
        Imposto[] impostos = {
                new PessoaFisica(40000),
                new PessoaJuridica(90000)
        };
        for (Imposto imposto : impostos)
            System.out.println("Calculo do Imposto: " +
                    imposto.calcularImposto());
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
}
