package codeclan.movie_rankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by derekmiddlemiss on 07/08/2017.
 */

public class RankingTest {

    Ranking topTen;
    Movie alien;
    Movie aliens;
    Movie bladerunner;
    Movie rotla;
    Movie tbl;

    @Before
    public void before(){
        topTen = new Ranking();
        alien = new Movie( "Alien", "Sci-Fi", 1 );
        aliens = new Movie( "Aliens", "Sci-Fi", 3 );
        bladerunner = new Movie( "Blade Runner", "Sci-Fi", 2 );
        rotla = new Movie( "Raiders of the Lost Ark", "Adventure", 5 );
        tbl = new Movie( "The Big Lebowski", "Comedy", 4 );
    }

    @Test
    public void testEmptyRanking(){
        assertNull( topTen.getMovieAtRank( 1 ) );
    }

    @Test
    public void canAddByRanking(){
        topTen.addMovieAtRank( alien );
        Integer alienRank = alien.getRanking();
        assertEquals( alien, topTen.getMovieAtRank( alienRank ) );
    }

    

}
