package SolutionOne;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", SolutionOne.whoLikesIt());
        assertEquals("Peter likes this", SolutionOne.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", SolutionOne.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", SolutionOne.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", SolutionOne.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}