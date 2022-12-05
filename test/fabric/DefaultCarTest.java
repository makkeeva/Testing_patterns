package fabric;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DefaultCarTest {
    DefaultCar car = new DefaultCar();

    @Test
    public void testDefaultCar(){
        List <String> accessories = new ArrayList();
        accessories.add("Just salon");
        accessories.add("Air condition");
        assertEquals("Usual Car", car.name);
        assertEquals(accessories, car.accessories);
        System.out.println("Test is passed");

    }

}