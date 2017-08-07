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
        assertEquals( 0, alien.getRanking() );
    }

    @Test
    public void testCanConstructWithRanking(){
        assertEquals( 2, aliens.getRanking() );
    }
}
