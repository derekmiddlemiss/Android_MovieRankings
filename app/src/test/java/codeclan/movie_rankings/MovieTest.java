package codeclan.movie_rankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by derekmiddlemiss on 07/08/2017.
 */

public class MovieTest {

    Movie alien;
    Movie aliens;

    @Before
    public void before(){
        alien = new Movie( "Alien", "Sci-Fi" );
        aliens = new Movie( "Aliens", "Sci-Fi", 2 );
    }

    @Test
    public void testCanConstructWithoutRanking(){
        assertNull( alien.getRanking() );
    }

    @Test
    public void testCanConstructWithRanking(){
        Integer expected = 2;
        assertEquals( expected, aliens.getRanking() );
    }

    @Test
    public void testCanSetRanking(){
        alien.setRanking( 1 );
        Integer expected = 1;
        assertEquals( expected, alien.getRanking() );
    }

    @Test
    public void testCanGetGenre(){
        assertEquals( "Sci-Fi", aliens.getGenre() );
    }

    @Test
    public void testCanSetGenre(){
        alien.setGenre( "Historical Romance" );
        assertEquals( "Historical Romance", alien.getGenre() );
    }

    @Test
    public void testCanGetTitle(){
        assertEquals( "Alien", alien.getTitle() );
    }

    @Test
    public void testCanSetTitle(){
        alien.setTitle( "How to Win Friends and Influence People" );
        assertEquals( "How to Win Friends and Influence People", alien.getTitle() );
    }

    @Test
    public void testOveriddenStringMethod(){
        String returned = aliens.toString();
        assertEquals( "Title: 'Aliens', Genre: Sci-Fi, Ranking: 2", aliens.toString() );
    }



}
