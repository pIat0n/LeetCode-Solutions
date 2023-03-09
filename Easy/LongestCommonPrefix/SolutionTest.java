package Easy.LongestCommonPrefix;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest{

    @Test
    public void longestCommonPrefixTest(){
        assertEquals("fl", new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void longestCommonPrefixTest2(){
        assertEquals("", new Solution().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
