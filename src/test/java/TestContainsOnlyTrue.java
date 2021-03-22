import hw6.ArrayUtilities;
import hw6.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestContainsOnlyTrue {
    @Test
    public void testContainsOnlyOneOrFour() {
        ArrayUtils arrayUtils = new ArrayUtilities();
        Assert.assertTrue(arrayUtils.containsOnlyOneOrFour(new int[] {1, 1, 1, 4, 4, 1, 4, 4}));
    }
}
