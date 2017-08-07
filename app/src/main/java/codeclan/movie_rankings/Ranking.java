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

    public Movie getLowestRankMovie(){
        for (int i = 9; i >= 0; i--) {
            if (this.ranking[i] != null) {
                return this.ranking[i];
            }
        }
        return null;
    }

    public Movie findByTitle( String searchTitle ){
        for ( Movie movie : this.ranking ) {
            if ( movie.getTitle() == searchTitle ){
                return movie;
            }
        }
        return null;
    }

    public void moveOneUp( Movie movie ) {
        Integer currentRanking = movie.getRanking();
        Integer targetRanking = currentRanking - 1;
        if ( this.ranking[ targetRanking - 1 ] == null ) {

            this.ranking[currentRanking - 1] = null;
            this.ranking[targetRanking - 1] = movie;
            movie.setRanking( targetRanking );

        } else {

            Movie replacedMovie = this.getMovieAtRank( targetRanking );
            replacedMovie.setRanking( null );
            this.ranking[currentRanking - 1] = null;
            this.ranking[targetRanking - 1] = movie;
            movie.setRanking( targetRanking );

        }
    }


    public void moveOneDown( Movie movie ) {
        Integer currentRanking = movie.getRanking();
        Integer targetRanking = currentRanking + 1;
        if ( this.ranking[ targetRanking - 1 ] == null ) {

            this.ranking[currentRanking - 1] = null;
            this.ranking[targetRanking - 1] = movie;
            movie.setRanking( targetRanking );

        } else {

            Movie replacedMovie = this.getMovieAtRank( targetRanking );
            replacedMovie.setRanking( null );
            this.ranking[currentRanking - 1] = null;
            this.ranking[targetRanking - 1] = movie;
            movie.setRanking( targetRanking );

        }
    }
}
