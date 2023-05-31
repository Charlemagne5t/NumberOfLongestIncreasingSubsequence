import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findNumberOfLISTest1() {
        int[] nums = {1, 3, 5, 4, 7};
        int output = 2;
        Assert.assertEquals(output, new Solution().findNumberOfLIS(nums));
    }

    @Test
    public void findNumberOfLISTest2() {
        int[] nums = {2, 2, 2, 2, 2};
        int output = 5;
        Assert.assertEquals(output, new Solution().findNumberOfLIS(nums));
    }

    @Test
    public void findNumberOfLISTest3() {
        int[] nums = {1, 2, 4, 3, 5, 4, 7, 2};
        int output = 3;
        Assert.assertEquals(output, new Solution().findNumberOfLIS(nums));
    }
}
