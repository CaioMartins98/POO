package br.com.caio.screenmatch.modelos;

import br.com.caio.screenmatch.calculo.Classificacao;

// Todo atributo precisa ser privado
// Classe: especifica o que vai ter no filme (no caso desse projeto)
public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (mediaAvaliacoes()/2);
    }
}
