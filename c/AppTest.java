import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSocket() throws Exception {
        String result = App.runSocket();
        assertEquals("Socket communication successful", result);
    }
}