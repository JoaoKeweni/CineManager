package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComListas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o filme: ");
        var filme = leitor.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t="+ filme + "&apikey=e3aa7a"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        try{
            Titulo meuTitulo = new Titulo(meuTituloOMDB);
            System.out.println("Titullo já convertido: ");
            System.out.println(meuTituloOMDB);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        }
    }
}
