package info.nahid.unitteast;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = {"classpath:test-configuration.properties"})
public class UnitTestingApplicationTest {

    @Test
    void contextLoads() {

    }
}