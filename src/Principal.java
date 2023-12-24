import br.com.caio.screenmatch.modelos.Filme;
import br.com.caio.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setDuracaoEmMinutos(90);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setAnoLancamento(2023);
        meuFilme.setNome("A fuga das Galinhas 2");
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.mediaAvaliacoes();
        meuFilme.estrelasFilme();
        meuFilme.exibeFichaTecnica();

        Serie serie = new Serie();
        serie.setIncluidoNoPlano(true);
        serie.setAnoLancamento(2006);
        serie.setNome("The office");
        serie.setAtiva(false);
        serie.setEpPorTemporada(13);
        serie.setTemporadas(10);
        serie.setMinutosPorEp(25);
        serie.avalia(10);
        serie.avalia(10);
        serie.avalia(10);
        serie.mediaAvaliacoes();
        serie.estrelasFilme();
        serie.exibeFichaTecnica();
        System.out.println("Ativa: " + (serie.isAtiva() ? "Sim" : "Não"));
    }
}
