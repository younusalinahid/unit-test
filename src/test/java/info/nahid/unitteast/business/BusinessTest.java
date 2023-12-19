package info.nahid.unitteast.business;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessTest {

    @Test
    public void calculateSum_basic() {
        BusinessImpl business = new BusinessImpl();
        int actualResult = business.calculateSum(new int[] {1, 2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calculateSum_empty() {
        BusinessImpl business = new BusinessImpl();
        int actualResult = business.calculateSum(new int[] { });
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_OneValue() {
        BusinessImpl business = new BusinessImpl();
        int actualResult = business.calculateSum(new int[] {10});
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }
}