import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    Movie(String title , String studio , String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    List<Movie> getPG(List<Movie> movies){

        ArrayList<Movie> pgMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (Objects.equals(movie.rating, "PG")) {
                pgMovies.add(movie);
            }
        }

        return pgMovies;
    }
}
