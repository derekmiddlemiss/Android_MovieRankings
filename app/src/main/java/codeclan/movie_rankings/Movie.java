package codeclan.movie_rankings;

/**
 * Created by derekmiddlemiss on 07/08/2017.
 */

public class Movie {

    String title;
    String genre;
    Integer ranking;

    public Movie( String title, String genre ){
        this.title = title;
        this.genre = genre;
    }

    public Movie( String title, String genre, Integer ranking){
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

    public Integer getRanking(){
        return this.ranking;
    }

    public void setRanking( Integer newRanking ){
        this.ranking = newRanking;
    }

    @Override
    public String toString(){
        return "Title: '" + this.title + "', Genre: " + this.genre + ", Ranking: " + this.ranking.toString();
    }
}
