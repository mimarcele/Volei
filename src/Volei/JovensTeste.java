package Volei;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JovensTeste {
    public static void main(String[] args) {


        Jovens j1 = new Jovens("Clara", 1.74, 13);
        Jovens j2 = new Jovens("Felipe", 1.10, 7);
        Jovens j3 = new Jovens("Lucas", 1.40, 15);
        Jovens j4 = new Jovens("Luiza", 1.65, 13);
        Jovens j5 = new Jovens("Solange", 1.34, 13);
        Jovens j6 = new Jovens("Dimitri", 1.64, 13);
        Jovens j7 = new Jovens("Letícia", 1.47, 14);
        Jovens j8 = new Jovens("Luana", 1.35, 12);
        Jovens j9 = new Jovens("Soraia", 1.44, 16);
        Jovens j10 = new Jovens("Davi", 1.43, 11);
        Jovens j11 = new Jovens("Enzo", 1.52, 13);

        List<Jovens> jovens = Arrays.asList(j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11);

        Predicate<Jovens> alturaSuficiente = a-> a.altura >=1.52;
        Predicate<Jovens> idade = i-> i.idade == 13;

        Function<Jovens, String> recepcao = r-> "Bem vindo(a) a escolinha de vôlei do Flamengo " +
                r.nome;

        jovens.stream().filter(alturaSuficiente).filter(idade).map(recepcao).forEach(System.out::println);



    }
}

