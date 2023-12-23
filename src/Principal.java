import br.com.caio.screenmatch.modelos.Filme;

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

    }
}
