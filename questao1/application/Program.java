package questao1.application;

import questao1.entities.Animais;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        // Animal:
        Animais animais = new Animais("Cachorro", "Canis lupus familiaris", 10);

        System.out.println(animais.toString());

        animais.atualizarIdade(6);

        System.out.println();
        // Atualizar idade:
        System.out.println(animais.toString());


    }
}
