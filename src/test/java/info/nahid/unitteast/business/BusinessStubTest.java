package info.nahid.unitteast.business;

import info.nahid.unitteast.service.DataService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DataserviceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {1, 2, 3};
    }
}

class DataserviceEmptyStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { };
    }
}

class DataserviceOneElementStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {10};
    }
}
public class BusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        BusinessImpl business = new BusinessImpl();
        business.setDataService(new DataserviceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calculateSumUsingDataService_empty() {
        BusinessImpl business = new BusinessImpl();
        business.setDataService(new DataserviceEmptyStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_OneValue() {
        BusinessImpl business = new BusinessImpl();
        business.setDataService(new DataserviceOneElementStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }
}
