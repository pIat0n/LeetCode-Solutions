package Easy.FindTheIndexOfTheFirstOccurrenceInAString;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest{
    
    @Test
    public void strStrTest(){
        assertEquals(0, new Solution().strStr("sadbutsad", "sad"));
    }

    @Test
    public void strStrTest2(){
        assertEquals(-1, new Solution().strStr("leetcode", "leeto"));
    }
}