package pattern_methood;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NetTest {

    Network network = new Instagram("user", "password");

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Hi", true }, { "Dasha", true }
        });
    }

    private final String message;
    private final Boolean expectedResult;

    public NetTest(String message,
                   Boolean expectedResult) {
        this.message = message;
        this.expectedResult = expectedResult;
    }

    @Test
    public void shouldReturnCorrectSum() {
        boolean res = network.post(message);
        assertEquals(expectedResult, res);
    }
    Network network2 = new VK("user", "password");

    @Test
    public void shouldReturnCorrectSum2() {
        boolean res = network2.post(message);
        assertEquals(expectedResult, res);
    }
}