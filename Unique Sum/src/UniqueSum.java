public class UniqueSum {

    public static int uniqueSum(int x, int y, int z) {

        int sum = x + y + z;

        if (x == y && x == z) {
            return 0;
        } else if (x == y) {
            return z;
        } else if (y == z) {
            return x;
        } else {
            return sum;
        }

    }
}
