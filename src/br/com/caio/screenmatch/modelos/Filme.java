package br.com.caio.screenmatch.modelos;

// Todo atributo precisa ser privado
// Classe: especifica o que vai ter no filme (no caso desse projeto)
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
