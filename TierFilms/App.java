package TierFilms;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
    imdbAPIConnect conexaoAPI = new imdbAPIConnect();
//Listando os Top 250 Melhores Filmes 
    conexaoAPI.listarTopFilmes(
        conexaoAPI.extractAPIBody(
           conexaoAPI.conectAPI(
               "https://imdb-api.com/en/API/Top250Movies/"+conexaoAPI.getKey())));
//Listando os TOP100 Filmes Mais Populares
    conexaoAPI.listarTopFilmes(
        conexaoAPI.extractAPIBody(
            conexaoAPI.conectAPI(
                "https://imdb-api.com/en/API/MostPopularMovies/"+conexaoAPI.getKey())));
} 
}
