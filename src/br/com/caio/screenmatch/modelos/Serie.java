package br.com.caio.screenmatch.modelos;

public class Serie extends Titulo{
    private int minutosPorEp;
    private int temporadas;
    private int epPorTemporada;
    private boolean ativa;

    @Override
    public int getDuracaoEmMinutos() {
        return (temporadas * epPorTemporada * minutosPorEp);
    }
    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }


}
