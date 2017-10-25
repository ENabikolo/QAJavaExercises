import java.util.ArrayList;

public class Intermediate {

    public static void main(String[] args) {

        blackJack(15, 9);
        uniqueSum(4, 6, 8);
        tooHot(65, true);


        //initializing Object array
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("James", 22, "Mechanic"));
        people.add(new Person("Peter", 36, "Travel Blogger"));
        people.add(new Person("Joanne",28, "Aerospace Engineer"));
        people.add(new Person("Clare", 39, "Web Developer"));
        System.out.println(people);

    }
        //Black Jack

    public static int blackJack(int a, int b) {
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

    //Unique Sum
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

    //TooHot
    public static boolean tooHot(int temperature, boolean isSummer) {
        if (temperature >= 60 && temperature <= 90 && !isSummer) {
            return true;
        } else if (temperature >= 60 && temperature <= 100 && isSummer) {
            return true;
        }

        else{
            return false;
        }

    }

}




