package Volei;

public class Jovens {
    final String nome;
    final double altura;
    final int idade;

    @Override
    public String toString() {
        return "Jovens{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }

    public Jovens(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
}
