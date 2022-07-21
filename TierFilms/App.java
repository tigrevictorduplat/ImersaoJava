package TierFilms;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
       //Conexão com a API
       String urlAPI = "https://alura-filmes.herokuapp.com/conteudos";
       URI uri = URI.create(urlAPI); 
       var client = HttpClient.newHttpClient();
       var request = HttpRequest.newBuilder(uri).GET().build();
       HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
       //Extração  e Separação dos Dados
       String apiBody = response.body();
       JsonParser parser = new JsonParser();
       List<Map<String,String>> listaFilmes = parser.parse(apiBody);
       //Exibição dos Dados
       for (Map<String,String> filmeListado : listaFilmes) {
        System.out.println(filmeListado.get("rank")+"°");
        System.out.println("Título: \u001b[107m\u001b[95m"+filmeListado.get("title")+"\u001b[m");
        System.out.println("Nota: "+filmeListado.get("imDbRating"));
        System.out.println(filmeListado.get("image"));
        System.out.println();
        System.out.println("-------------------");
        

       }
    }
}
