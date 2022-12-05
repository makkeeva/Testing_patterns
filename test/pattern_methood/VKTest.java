package pattern_methood;

import org.junit.Test;

import static org.junit.Assert.*;

public class VKTest {


    @Test
    public void testVK() {
        VK network = new VK("userName", "password");
        String message = "tmp";
        assertEquals("userName", network.getUserName());
        assertEquals("password", network.getPassword());
        assertEquals(true, network.logIn(network.userName, network.password));
        assertEquals(true, network.sendData(message.getBytes()));
        System.out.println("Test passed");
    }

}