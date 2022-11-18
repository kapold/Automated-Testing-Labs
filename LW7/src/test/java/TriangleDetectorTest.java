import org.example.TriangleDetector;
import org.junit.Assert;
import org.junit.Test;

public class TriangleDetectorTest {
    @Test
    public void Test1(){
        double a = 10.0;
        double b = 4.0;
        double c = 5.0;
        Assert.assertFalse(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test2(){
        double a = 4.0;
        double b = 5.0;
        double c = 6.0;
        Assert.assertTrue(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test3(){
        double a = 100.0;
        double b = 1.0;
        double c = 1.0;
        Assert.assertFalse(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test4(){
        double a = 4;
        double b = 3;
        double c = 5;
        Assert.assertTrue(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test5(){
        double a = 16.4;
        double b = 21.8;
        double c = 9.99;
        Assert.assertTrue(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test6(){
        double a = -196.4;
        double b = -211.8;
        double c = 1009.99;
        Assert.assertFalse(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test7(){
        double a = 1;
        double b = 1;
        double c = 1;
        Assert.assertTrue(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test8(){
        double a = 0;
        double b = 0;
        double c = 0;
        Assert.assertFalse(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test9(){
        double a = 31;
        double b = 31;
        double c = 31;
        Assert.assertTrue(new TriangleDetector().isExists(a, b, c));
    }

    @Test
    public void Test10(){
        double a = 6;
        double b = 8;
        double c = 10;
        Assert.assertTrue(new TriangleDetector().isExists(a, b, c));
    }
}