package TierFilms;

public class App {
    public static void main(String[] args) throws Exception {
    imdbAPIConnect conexaoAPI = new imdbAPIConnect();
//Listando os Top 250 Melhores Filmes 

   conexaoAPI.transformaUrlFigurinha(
        conexaoAPI.extractAPIBody(
           conexaoAPI.conectAPI(
           "https://imdb-api.com/en/API/Top250Movies/"+conexaoAPI.getKey()
               )),20);
/* 
//Listando os TOP100 Filmes Mais Populares
    conexaoAPI.listarTopFilmes(
        conexaoAPI.extractAPIBody(
            conexaoAPI.conectAPI(
                "https://imdb-api.com/en/API/MostPopularMovies/"+conexaoAPI.getKey())));
*/
} 
}
