package questao2.entities;

public class Produto {

    private String nome;
    private Integer quantidadeEstoque;

    public Produto() {

    }

    public Produto(String produto, Integer quantidadeEstoque) {
            this.nome = produto;
            this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoqueProduto(int quantidade){
        if(quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
        else{
            System.out.println("Quantidade Inválida");
        }
    }

    public void removerEstoqueProduto(int quantidade){
        if(quantidade < quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        }
        else{
            System.out.println("Quantidade Inválida");
        }
    }


    @Override
    public String toString() {
        return "Produtos em estoque: \n" +
                "Nome = " + nome + "\n" +
                "quantidadeEstoque = " + quantidadeEstoque + "\n";
    }
}
