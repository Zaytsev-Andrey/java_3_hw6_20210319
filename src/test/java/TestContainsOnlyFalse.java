import hw6.ArrayUtilities;
import hw6.ArrayUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestContainsOnlyFalse {
    private static ArrayUtils arrayUtils;
    private int[] arr;

    @BeforeClass
    public static void init() {
        arrayUtils = new ArrayUtilities();
    }

    public TestContainsOnlyFalse(int[] arr) {
        this.arr = arr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[] {1, 1, 1, 1, 1, 1}},
                {new int[] {4, 4, 4, 4}},
                {new int[] {1, 4, 4, 1, 1, 4, 3}}
        });
    }

    @Test
    public void testContainsOnlyOneOrFour() {
        Assert.assertFalse(arrayUtils.containsOnlyOneOrFour(arr));
    }


}
