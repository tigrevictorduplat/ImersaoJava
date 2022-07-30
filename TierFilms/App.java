package TierFilms;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
      imdbAPIConnect listaTopFilmes = new imdbAPIConnect();
      listaTopFilmes.listarTopFilmes(
        listaTopFilmes.extractAPIBody(
            listaTopFilmes.conectAPI(
                "https://api.mocki.io/v2/549a5d8b")));
    }
}
