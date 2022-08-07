import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javamvn.services.SqrtService;

public class SqrtServiceTest {
    @Test
    public void shouldCaclcExact() {
        SqrtService service = new SqrtService();

        int expected = 5;
        int actual = service.sqrt(25);
        Assertions.assertEquals(expected, actual);
    }
}
