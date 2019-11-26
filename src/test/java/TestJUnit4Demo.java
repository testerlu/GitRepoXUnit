import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestJUnit4Demo {
    @Test
    public void testDemo(){
        //System.out.println("hello");
        assertTrue(true);
        System.out.println("nihao");
    }

    @Test
    public void testDemo2(){
        assertTrue(false);
        System.out.println("hi");
        System.out.println("nihao");
    }
}
