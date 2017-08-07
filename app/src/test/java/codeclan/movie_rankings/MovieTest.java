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

    @Before
    public void before(){
        alien = new Movie( "Alien", "Sci-fi" );
    }

    @Test
    public void testCanConstructWithoutRanking(){
        assertEquals( 0, alien.getRanking() );
    }

}
