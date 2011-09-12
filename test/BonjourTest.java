package ca.uqam.mgl7361.a2011.hello;

import org.junit.*;
import static org.junit.Assert.*;

public class BonjourTest {
    @Test public void it_greets_a_person_by_its_name() {
        Bonjour b = new Bonjour();
        assertEquals("Bonjour Test!", b.bonjour("Test"));
    }
}
