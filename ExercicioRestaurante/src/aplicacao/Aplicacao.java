package aplicacao;

import java.util.Scanner;
import entidade.Pedido;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Soda Italiana", 20.5);
        pedido.adicionarItem("Macarrão", 49.5);
        pedido.adicionarItem("Chá", 6.1);
        pedido.adicionarItem("Pizza", 35.0);

        System.out.println("O que deseja comer: " +
                "1. Macarrão " +
                "2. Pizza ");
        int comer = sc.nextInt();
        System.out.println("O que deseja beber: " +
                "1. Chá " +
                "2. Soda Italiana ");
        int beber = sc.nextInt();

        double total = 0.0;

        if (comer == 1 && beber == 1) {
            total = 49.5 + 6.1;
        } else if (comer == 1 && beber == 2) {
            total = 49.5 + 20.5;
        } else if (comer == 2 && beber == 1) {
            total = 35 + 6.1;
        } else if (comer == 2 && beber == 2) {
            total = 35 + 20.5;
        } else {
            System.out.println("Opção inválida.");
            return; // Adiciona uma saída caso a opção seja inválida
        }

        System.out.println("O total do seu pedido é: " + total);
        sc.close(); // Fecha o scanner
    }
}
