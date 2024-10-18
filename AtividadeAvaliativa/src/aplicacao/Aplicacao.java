package aplicacao;
import entidade.Pessoa;

import java.util.Scanner;
public class Aplicacao {

    public static void main(String[] args) {


        Pessoa p = new Pessoa("Ana", 16, "abc", 123);
        System.out.println(p.toString());

    }
}
