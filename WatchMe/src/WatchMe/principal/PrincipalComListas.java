package WatchMe.principal;

import WatchMe.modelos.Filme;
import WatchMe.modelos.Serie;
import WatchMe.modelos.Titulo;
import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Maze Runner: Correr ou Morrer", 2014);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Maze Runner: Prova de Fogo", 2015);
        outroFilme.avalia(8);
        var filmeDaSilvia = new Filme("Spirit: O Corcel Indomável", 2002);
        filmeDaSilvia.avalia(7);
        Serie lucifer = new Serie("Lúcifer", 2016);

        Filme f1 = filmeDaSilvia;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDaSilvia);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lucifer);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gustavo");
        buscaPorArtista.add("Silvia");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
