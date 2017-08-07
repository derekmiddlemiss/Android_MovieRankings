package codeclan.movie_rankings;

/**
 * Created by derekmiddlemiss on 07/08/2017.
 */

public class Movie {

    String title;
    String genre;
    int ranking;

    public Movie( String title, String genre ){
        this.title = title;
        this.genre = genre;
    }

    public Movie( String title, String genre, int ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle( String newTitle ){
        this.title = newTitle;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre( String newGenre ){
        this.genre = newGenre;
    }

    public int getRanking(){
        return this.ranking;
    }

    public void setRanking( int newRanking ){
        this.ranking = newRanking;
    }
}
