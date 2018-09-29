package test.java.pattern.singleton;

import main.java.pattern.singleton.SingletonEeager;
import org.junit.Assert;
import org.junit.Test;

public class SingletonEagerTest {

    @Test
    public void testThatTwoVariablesOfInstanceAreEqual() {
        SingletonEeager first = SingletonEeager.getInstance();
        SingletonEeager second = SingletonEeager.getInstance();

        Assert.assertTrue(first == second);
        Assert.assertEquals(first, second);
    }
    @Test
    public void testCountValueIsConstant(){
        SingletonEeager first = SingletonEeager.getInstance();
        SingletonEeager second = SingletonEeager.getInstance();

        int expectedCount =1;

        Assert.assertEquals(expectedCount, first.getCount());
        Assert.assertEquals(expectedCount, second.getCount());
    }
}
