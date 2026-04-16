import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testTransmit() throws Exception {
        String result = App.transmit();
        assertEquals("Transmission successful", result);
    }
}