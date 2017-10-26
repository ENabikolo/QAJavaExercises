import static org.junit.Assert.*;


import org.junit.Test;

public class UniqueSumTest {
    int x;
    int y;
    int z;

    UniqueSum s = new UniqueSum();


    int sum = x + y + z;

    @Test //3 Unique
    public void test1() {
        assertEquals(9, s.uniqueSum(4, 3, 2));
    }

    @Test// 1 Unique
    public void test2() {
        assertEquals(16, s.uniqueSum(5, 6, 5));
    }


    @Test // 0 Unique
    public void test3(){
        assertEquals(0, s.uniqueSum(5, 5, 5));

    }
}

