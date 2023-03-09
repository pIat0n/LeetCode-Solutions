package Easy.ClimbingStairs;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest{

    @Test
    public void climbStairsTest(){
        assertEquals(2, Solution.climbStairs(2));
    }

    @Test
    public void climbStairsTest2(){
        assertEquals(3, Solution.climbStairs(3));
    }

    @Test
    public void climbStairsTest3(){
        assertEquals(1134903170, Solution.climbStairs(44));
    }
}
