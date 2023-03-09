package Easy.AddBinary;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest{

    @Test
    public void addBinaryTest1(){
        assertEquals("100", new Solution().addBinary("11", "1"));
    }

    @Test
    public void addBinaryTest2(){
        assertEquals("10101", new Solution().addBinary("1010", "1011"));
    }
}
