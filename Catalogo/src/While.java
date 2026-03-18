import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvalicao = 0;
        int totalDeNotas = 0;

        while (nota != -1 && totalDeNotas != 3) {
            System.out.println("Diga sua avalicao");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvalicao += nota;
                totalDeNotas += 1;
            }
        }

        System.out.println("media: " + mediaAvalicao / 3);
    }
}
