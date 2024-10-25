package entidade;

public abstract class ProdutoImpl implements Produto {
    String nome;
    int quantidade = 50;

    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int adicionarQuantidade() {
        quantidade = 15 + quantidade;
        return quantidade;
    }

    public int removerQuantidade() {
        quantidade = quantidade - 40;
        return quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}