import org.junit.Test;
import static org.junit.Assert.*;

public class LaptopTest {
    @Test
    public void testLaptopInstance() {
        Laptop myLaptop = new Laptop();
        assertNotNull("Laptop object should not be null", myLaptop);
    }
}
