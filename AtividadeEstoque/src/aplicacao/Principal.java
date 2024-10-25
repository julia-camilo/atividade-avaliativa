package aplicacao;

import entidade.Produto;

public class Principal implements Produto {
    public static void main(String[] args) {
        Produto produto = new Produto() {
            @Override
            public String getNome() {
                return "Frutas";
            }

            @Override
            public int getQuantidade() {
                return 50;
            }

            @Override
            public int removerQuantidade() {
                return 10;
            }

            @Override
            public int adicionarQuantidade() {
                return 65;
            }
        };
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Adicionar 15 ao estoque: " + produto.adicionarQuantidade());
        System.out.println("Remover 40 do estoque: " + produto.removerQuantidade());
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int getQuantidade() {
        return 0;
    }

    @Override
    public int removerQuantidade() {
        return 0;
    }

    @Override
    public int adicionarQuantidade() {
        return 0;
    }
}
