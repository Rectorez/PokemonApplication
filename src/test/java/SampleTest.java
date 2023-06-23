import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    void VerifyString() {
        String expected = "String";
        String actual = "String";

        Assertions.assertEquals(expected, actual);
    }
}
