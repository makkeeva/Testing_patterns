package pattern_methood;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstaTest {
    //Instagram network = new Instagram("userName", "password");
    @Test
    public void testInstagram(){
        Instagram network = new Instagram("userName", "password");
        String message = "tmp";
        assertEquals("userName", network.userName);
        assertEquals("password", network.password);
        assertEquals(true, network.logIn(network.userName, network.password));
        assertEquals(true, network.sendData(message.getBytes()));
        System.out.println("Test passed");
    }
}