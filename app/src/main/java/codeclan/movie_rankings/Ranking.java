package codeclan.movie_rankings;

/**
 * Created by derekmiddlemiss on 07/08/2017.
 */

public class Ranking {

    Movie[] ranking;

    public Ranking(){
        this.ranking = new Movie[10];
    }

    public Movie getMovieAtRank( Integer rank ){
        return this.ranking[ rank - 1 ];
    }

    public void addMovieAtRank( Movie movie ){
        Integer movieRanking = movie.getRanking();
        this.ranking[ movieRanking - 1 ] = movie;
    }
}
