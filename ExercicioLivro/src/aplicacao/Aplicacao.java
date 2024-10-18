package aplicacao;

import java.util.Scanner;

import entidade.Livro;


public class Aplicacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Titulo: ");
        String titulo = leitor.nextLine();
        System.out.println("Autor: ");
        String autor = leitor.nextLine();
        System.out.println("Ano de publicacao: ");
        int anoPublicacao = leitor.nextInt();
        System.out.println("Preco: ");
        double preco = leitor.nextDouble();

        Livro ficha = new Livro(titulo, autor, anoPublicacao, preco);
        System.out.println("Escolha:" +
                "1. Ver ficha do livro;" +
                "2. Fechar o programa.");
        int op = leitor.nextInt();
        if (op == 1) {
            System.out.println(ficha);
        } else if (op ==2) {
            System.out.println("Fim!");
        }
    }
}
