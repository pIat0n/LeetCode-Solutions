package Easy.LengthOfLastWord;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest{

    @Test
    public void lengthOfLastWordTest(){
        assertEquals(5, Solution.lengthOfLastWord("Hello World"));
    }

    @Test
    public void lengthOfLastWordTest2(){
        assertEquals(4, Solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void lengthOfLastWordTest3(){
        assertEquals(6, Solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
