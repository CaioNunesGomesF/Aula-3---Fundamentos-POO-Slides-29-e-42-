package questao2.application;


import questao2.entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        // Adicionar primeiro produto:

        produtos.add( new Produto("Leite", 8));

        // Adicionar segundo produto :

        produtos.add( new Produto("Feijão", 10));

        // Primeira impressão

        produtos.forEach(System.out::println);

        // Adicionar 4 em quantidade de estoque no produto leite
        System.out.println("\nAtUALIZAR PRODUTO: \n");
        produtos.stream().filter(x -> x.getNome().equalsIgnoreCase("Leite")).forEach(x -> x.adicionarEstoqueProduto(4));

        produtos . forEach(System.out::println);

        // Remover Feijão
        System.out.println("\nREMOVER:\n");
        produtos.removeIf(x -> x.getNome().equalsIgnoreCase("Feijão"));

        produtos . forEach(System.out::println);

        // Remover estoque

        produtos.stream().filter(x -> x.getNome().equalsIgnoreCase("Leite")).forEach(x-> x.removerEstoqueProduto(10));
        System.out.println("\nREMOVER ESTOQUE: \n");
        produtos.forEach(System.out::println);
    }
}
