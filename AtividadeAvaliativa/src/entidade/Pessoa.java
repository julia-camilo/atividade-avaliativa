package entidade;

import java.util.Objects;

public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    int telefone;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Pessoa(String nome, int idade, String endereco, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
