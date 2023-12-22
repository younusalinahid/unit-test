package info.nahid.unitteast.business;
import info.nahid.unitteast.data.DataService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessMockTest {

    @InjectMocks
    BusinessImpl business;

    @Mock
    DataService dataServiceMock;

    @Before
    public void before() {
        business.setDataService(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});
       assertEquals(6, business.calculateSumUsingDataService());
    }


    @Test
    public void calculateSumUsingDataService_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_OneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {10});
        assertEquals(10, business.calculateSumUsingDataService());
    }
}
