public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estao curtindo");
        } else {
            System.out.println("Filmes ruins");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("está ok");
        }
    }
}
