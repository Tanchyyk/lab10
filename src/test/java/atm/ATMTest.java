package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM atm;
    @BeforeEach
    void setUp() {
        atm = new ATM();
    }

    @Test
    void getFirstTray() {
        assertEquals("Tray20()", atm.getFirstTray().toString());
    }
}