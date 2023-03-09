package Easy.AddBinary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class SolutionTest{

    @Test
    public void addBinaryTest(){
        assertEquals("100", Solution.addBinary("11", "1"));
    }

    @Test
    public void addBinarySecondTest(){
        assertEquals("10101", Solution.addBinary("1010", "1011"));
    }
}
