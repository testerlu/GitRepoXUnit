import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestJUnit4Demo {
    @Test
    public void testDemo(){
        //System.out.println("hello");
        assertTrue(true);
    }

    @Test
    public void testDemo2(){
        assertTrue(false);
        System.out.println("hi");
        System.out.println("nihao");
    }
}
