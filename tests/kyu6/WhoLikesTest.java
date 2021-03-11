package kyu6;

import kyu6.WhoLikes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhoLikesTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikes.whoLikesIt());
        assertEquals("Peter likes this", WhoLikes.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikes.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikes.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikes.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}