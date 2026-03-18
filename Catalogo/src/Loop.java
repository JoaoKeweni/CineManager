import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        double nota = 0;
        double mediaAvalicao = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Diga sua avalicao");
            nota = leitura.nextDouble();
            mediaAvalicao += nota;
        }

        System.out.println("media: " + mediaAvalicao / 3);
    }
}
