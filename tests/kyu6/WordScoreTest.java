package kyu6;

import kyu6.WordScore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordScoreTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", WordScore.high("man i need a taxi up to ubud"));
        assertEquals("volcano", WordScore.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", WordScore.high("take me to semynak"));
    }
}