package junittest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//JUnit4 had @Ignore annotation for disabling the test
public class DisabledMethodTest4 {

    @Disabled("Disabled until CustomerService is up!")
    @Test
    void testCustomerServiceGet() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test3Plus3() {
        assertEquals(6, 3 + 3);
    }

}

