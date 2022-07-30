package TierFilms;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
    imdbAPIConnect conexaoAPI = new imdbAPIConnect();
    conexaoAPI.listarTopFilmes(conexaoAPI.extractAPIBody(
           conexaoAPI.conectAPI(
               "https://imdb-api.com/en/API/Top250Movies/"+conexaoAPI.getKey())));

    conexaoAPI.listarTopFilmes(
        conexaoAPI.extractAPIBody(
            conexaoAPI.conectAPI(
                "https://imdb-api.com/en/API/Top250TVs/"+conexaoAPI.getKey())));
} 
}
