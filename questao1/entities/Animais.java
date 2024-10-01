package questao1.entities;

public class Animais {

    private String nome;
    private String especie;
    private Integer idade;

    public Animais(String nome, String especie, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void atualizarIdade(Integer idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome= " + nome + "\n" +
                "especie = " + especie + "\n" +
                "idade = " + idade
                ;
    }
}
