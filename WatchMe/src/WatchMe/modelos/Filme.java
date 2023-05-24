package WatchMe.modelos;

import WatchMe.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {

        super(nome, anoDeLancamento);
    }

    public String getDiretor() {

        return diretor;
    }
    public void setDiretor(String diretor) {

        this.diretor = diretor;
    }
    public int getClassificacao() {

        return (int) pegaMedia() / 2;
    }
    public String toString() {

        return "Filme " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

