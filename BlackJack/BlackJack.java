
public class BlackJack {



    public static void main(String[] args) {

        blackJack(15, 9);
    }

    public static int blackJack ( int a, int b){
        if (a >= 21 && b >= 21) {
            return 0;
        } else if (b >= 21) {
            return a;
        } else if (a >= 21) {
            return b;
        } else {
            if (a < b) {
                return b;
            } else {
                return a;

            }
        }

    }
}



