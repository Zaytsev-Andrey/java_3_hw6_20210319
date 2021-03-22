import hw6.ArrayUtilities;
import hw6.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSubArr {
    private ArrayUtils arrayUtils;

    @Before
    public void before() {
        arrayUtils = new ArrayUtilities();
    }

    @Test
    public void testSubArrAfterLastFour1() {
        Assert.assertArrayEquals(new int[] {1, 7},
                arrayUtils.subArrAfterLastFour(new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void testSubArrAfterLastFour2() {
        Assert.assertArrayEquals(new int[] {},
                arrayUtils.subArrAfterLastFour(new int[] {1, 2, 4, 4}));
    }

    @Test
    public void testSubArrAfterLastFour3() {
        Assert.assertArrayEquals(new int[] {1, 7, 5, 1},
                arrayUtils.subArrAfterLastFour(new int[] {4, 4, 2, 3, 4, 1, 7, 5, 1}));
    }

    @Test(expected = RuntimeException.class)
    public void testSubArrAfterLastFour4() {
        arrayUtils.subArrAfterLastFour(new int[] {7, 5, 1});
    }
}
