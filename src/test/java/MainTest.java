import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 26.05.2017.
 */
public class MainTest {
    @Test
    public void test0(){
        double[]x=Main.solve(1, 0, 1);
        Assert.assertEquals(x.length, 0);
    }
    @Test
    public void test1(){
        double[]x=Main.solve(1, -2, 1);
        double[]expected={1};
        Assert.assertArrayEquals(x, expected, 1e-8);
    }
    @Test
    public void test2(){
        double[]x=Main.solve(1, -5, 6);
        double[]expected={2,3};
        Assert.assertArrayEquals(x, expected, 1e-8);
    }
}
