# ImersaoJava
 Repositório criado para expor os aprendizados  que tive durante a Imersão Java em 2022

## Aula 01 - Consumindo uma API de Filmes com Java ☕
Nessa primeira aula aprendi a acessar uma API como a de [**Top250Movies**](https://imdb-api.com/api/#Top250Movies-header) do *IMDB* que retorna um arquivo `.JSON`. Com ele em mãos usei de uma série de métodos ***RegEx*** para dividir o output em partes. No fim tivemos uma saída simples com apenas as informações desejadas!

Essa conexão se deu através do uso de bibliotecas do `java.net` como:
* `URI`
* `http.HttpClient`
* `http.HttpRequest`
* `http.HttpResponse`

Além disso, utilizei de uma classe responsável parse do `.JSON` obtido que pode ser encontrada [aqui](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3) no perfil de um dos instrutores da *Imersão Java*, o [Alexandre Aquiles](https://gist.github.com/alexandreaquiles)

No fim, usando as bibliotecas do `java.util`, <Map> e <List>, pude armazenar os dados repartidos da API em uma lista e, com uma estrutura de laço, exibí-las
### Desafios Extras 🤘
* Sistema de Classificação em Estrelas(Arredondado) ⭐
  *  Através de uma *Classe*, com *Métodos* que contabilizam a nota e a transformam  numa *classificação por estrelas*, pudemos exibir a nota dos filmes listados nessa nova classificação
* Acessando outra API 🔝
  * Além da `Top250Movies` escolhi acessar a [MostPopularMovies](https://imdb-api.com/api/#MostPopularMovies-header), o que acabou gerando um problema <em style= color:magenta;}>(seguido de sua solução)</em> quanto aos filmes sem nenhuma classificação. Adicionando à esses filmes a mensagem `"🚧Waiting for IMDB Rating🚧"'`
