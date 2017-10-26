
import static org.junit.Assert.*;
import org.junit.Test;

public class BlackJackTest {
    @Test
    public void test1(){a >= 21 && b >= 21
        assertEquals(0, b.blackJack(21, 25));
    }

    @Test
    public void test2(){ b >= 21
    assertEquals(9, b.blackJack(9, 22));
    }

    @Test
    public void test3(){ a >= 21
    assertEquals(15, b.blackJack(21,15));
    }

    @Test
    public void test4(){ a < b
    assertEquals(16, b.blackJack(14,16))
    }


    @Test
    public void test2(){ a > b
    assertEquals(20, b.blackJack(20,19));
    }
