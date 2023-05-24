package WatchMe.principal;

import WatchMe.calculos.CalculadoraDeTempo;
import WatchMe.calculos.FiltroRecomendacao;
import WatchMe.modelos.Episodio;
import WatchMe.modelos.Filme;
import WatchMe.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Maze Runner: Correr ou Morrer", 2014);
        meuFilme.setDuracaoEmMinutos(113);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lucifer = new Serie("Lúcifer", 2016);
        lucifer.exibeFichaTecnica();
        lucifer.setTemporadas(6);
        lucifer.setEpisodiosPorTemporada(16);
        lucifer.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lucifer.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Maze Runner: Prova de Fogo", 2015);
        outroFilme.setDuracaoEmMinutos(133);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lucifer);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lucifer);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaSilvia = new Filme("Spirit: O Corcel Indomável", 2002);
        filmeDaSilvia.setDuracaoEmMinutos(84);
        filmeDaSilvia.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaSilvia);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}
