import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void Sum_2and6_Test(){
        double a = 2.0;
        double b = 6.0;
        char operation = '+';
        double waitedResult = 8.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Sum_435and32_Test(){
        double a = 435.0;
        double b = 32.0;
        char operation = '+';
        double waitedResult = 467.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Difference_5and6_Test(){
        double a = 5.0;
        double b = 6.0;
        char operation = '-';
        double waitedResult = -1.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Difference_11andMinus11_Test(){
        double a = 10.0;
        double b = -10.0;
        char operation = '-';
        double waitedResult = 20.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Multiply_12and12_Test(){
        double a = 12.0;
        double b = 12.0;
        char operation = '*';
        double waitedResult = 144.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Multiply_99and99_Test(){
        double a = 99.0;
        double b = 99.0;
        char operation = '*';
        double waitedResult = 9801.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Divide_3and5_Test(){
        double a = 3.0;
        double b = 5.0;
        char operation = '/';
        double waitedResult = 0.6;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Divide_100and5_Test(){
        double a = 100.0;
        double b = 5.0;
        char operation = '/';
        double waitedResult = 20.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Mod_52And5_Test(){
        double a = 52.0;
        double b = 5.0;
        char operation = '%';
        double waitedResult = 2.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void Mod_100and100_Test(){
        double a = 100.0;
        double b = 100.0;
        char operation = '%';
        double waitedResult = 0.0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult, 0);
    }

    @Test
    public void InvalidOperationTest(){
        double a = 14;
        double b = 77;
        char operation = '@';
        double waitedResult = 0;
        Assert.assertEquals(new Calculator().execute(a, b, operation), waitedResult,0);
    }
}