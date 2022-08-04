package TierFilms;

public class StarRank {
    public String covertRanktoStars(int rank) {
         String stars = "";
        switch (rank) {
            case 1:
            case 2:
               stars = "⭐"; 
            break;
            case 3:
            case 4:
               stars = "⭐⭐"; 
            break;
            case 5:
            case 6:
               stars = "⭐⭐⭐"; 
            break;
            case 7:
            case 8:
               stars = "⭐⭐⭐⭐"; 
            break;
            case 9:
            case 10:
               stars = "⭐⭐⭐⭐⭐"; 
            break;
            default:
                break;
        }
        return stars;
    }
    public Integer rankRounder(String rank) {
        var intRank = (int) Math.round(Double.parseDouble(rank));
        return intRank;
    }
}
