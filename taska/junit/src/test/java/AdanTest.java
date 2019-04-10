import static org.junit.Assert.assertEquals;

import org.junit.Test;
import the.testclass.Adan;

public class AdanTest {
    String a = "bigan";
    Adan adan = new Adan(a);

    @Test
    public void testbegan(){
        assertEquals(a,adan.began());
    }
}
