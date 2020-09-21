package Volei;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchJovens {
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
        Jovens j10 = new Jovens("Davi", 1.15, 6);
        Jovens j11 = new Jovens("Enzo", 1.52, 13);

        List<Jovens> jovens = Arrays.asList(j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);

        Predicate<Jovens> crianca = m -> m.idade > 10;
        Predicate<Jovens> baixo = b-> b.altura > 1.20;

        System.out.println(jovens.stream().allMatch(crianca));
        System.out.println(jovens.stream().allMatch(baixo));
        System.out.println(jovens.stream().anyMatch(baixo));
        System.out.println(jovens.stream().anyMatch(baixo));
        System.out.println(jovens.stream().noneMatch(baixo));
        System.out.println(jovens.stream().noneMatch(baixo));


    }
}
