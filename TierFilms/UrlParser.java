package TierFilms;

public class UrlParser {
    public static String removeAtributoURL(String url) {
        var regex = "(?<=@\\.).+(?=jpg)";
        var replacement = "";
        String novaurl= url.replaceAll(regex, replacement);
        return novaurl;
    }
}
