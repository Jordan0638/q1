import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testLogic() {
        assertFalse(App.andOp(true, false));
        assertTrue(App.orOp(true, false));
    }
}