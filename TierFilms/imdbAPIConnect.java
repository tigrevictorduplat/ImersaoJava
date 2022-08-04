package TierFilms;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class imdbAPIConnect {
  private String key = "";
  public String getKey() {
      return key;
  }
    public HttpResponse<String> conectAPI(String urlAPI) throws IOException, InterruptedException {
     //Conexão com a API
     URI uri = URI.create(urlAPI); 
     HttpClient client = HttpClient.newHttpClient();
     HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
     HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
     return response;
    }
    public List<Map<String,String>> extractAPIBody(HttpResponse<String> response) {
     //Extração  e Separação dos Dados
     String apiBody = response.body();
     JsonParser parser = new JsonParser();
     List<Map<String,String>> listaFilmes = parser.parse(apiBody);
     return listaFilmes;
    }

     public void listarTopFilmes(List<Map<String,String>> listaFilmes) {  
     //Exibição dos Dados
     StarRank emojiStarRank = new StarRank();
     for (Map<String,String> filmeListado : listaFilmes) {
      System.out.println(filmeListado.get("rank")+"°");
      System.out.println("Título: \u001b[107m\u001b[95m"+filmeListado.get("title")+"\u001b[m");
      System.out.println("Nota: "+emojiStarRank.covertRanktoStars(emojiStarRank.rankRounder(filmeListado.get("imDbRating"))));
      var imageOutput = (filmeListado.get("image") != null)? filmeListado.get("image") : "";
      System.out.println(imageOutput);
      System.out.println("-------------------");
    }
    }
}
