import br.com.alura.cinemanager.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme ();
        meuFilme.setNome("poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);

        meuFilme.exibeFichaTecnicna();
        meuFilme.avalia(5);
        meuFilme.avalia(3);
        meuFilme.avalia(10);
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
    }
}