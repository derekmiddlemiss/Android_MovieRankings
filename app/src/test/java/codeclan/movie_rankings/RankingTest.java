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
    Movie gwtw;

    @Before
    public void before(){
        topTen = new Ranking();
        alien = new Movie( "Alien", "Sci-Fi", 1 );
        aliens = new Movie( "Aliens", "Sci-Fi", 3 );
        bladerunner = new Movie( "Blade Runner", "Sci-Fi", 2 );
        rotla = new Movie( "Raiders of the Lost Ark", "Adventure", 5 );
        tbl = new Movie( "The Big Lebowski", "Comedy", 4 );
        gwtw = new Movie( "Gone With The Wind", "Historical Romance", 8);
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

    @Test
    public void testGetLowestRankMovie(){
        topTen.addMovieAtRank( alien );
        topTen.addMovieAtRank( aliens );
        topTen.addMovieAtRank( bladerunner );
        topTen.addMovieAtRank( gwtw );
        assertEquals( gwtw, topTen.getLowestRankMovie() );
    }

    @Test
    public void testFindByTitle(){
        topTen.addMovieAtRank( alien );
        topTen.addMovieAtRank( aliens );
        topTen.addMovieAtRank( bladerunner );
        Movie foundMovie = topTen.findByTitle( "Blade Runner" );
        assertEquals( bladerunner, foundMovie );
    }

    @Test
    public void testMoveOneUp(){
        topTen.addMovieAtRank( alien );
        topTen.addMovieAtRank( aliens );
        topTen.addMovieAtRank( bladerunner );
        Integer aliensRanking = aliens.getRanking();
        Integer expected = aliensRanking - 1;
        topTen.moveOneUp( aliens );
        assertEquals( expected, aliens.getRanking() );
        assertEquals( aliens, topTen.getMovieAtRank( aliensRanking - 1) );
    }

    @Test
    public void testMoveOneDown(){
        topTen.addMovieAtRank( alien );
        topTen.addMovieAtRank( aliens );
        topTen.addMovieAtRank( bladerunner );
        Integer bladerunnerRanking = bladerunner.getRanking();
        Integer expected = bladerunnerRanking + 1;
        topTen.moveOneDown( bladerunner );
        assertEquals( expected, bladerunner.getRanking() );
        assertEquals( bladerunner, topTen.getMovieAtRank( bladerunnerRanking + 1) );
    }
}
