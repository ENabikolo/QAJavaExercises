public class HelloWorld {                     //"public" is an access modifier. Limits visibility of an objects attributes or methods. : private, protected and default. All your methods should be private.


    public static void main(String[] args) {  // (String [] args); String array of arguments. An array of strings called arguments.
        int a = 5;
        int b = 2;
        System.out.println("Hello World!");

        //Store Hello World in a variable then output it to the console via a System.out.println statement in your main method.
        String myVar = "Hello World";
        System.out.println(myVar); // Double check.
        speak("text");
        System.out.println(getString());
        System.out.println(addNum(a, b));
        System.out.println(addNumConditional(a, b, true));


        for (int i = 0; i < 10; i++){
            System.out.println(addNumConditional2(0, i));

        }

    }

    //Create a method that accepts a string as a parameter and then outputs that to the console, then calls that method from your main method.
    static void speak(String myString) {
        System.out.println(myString);
    }

    //return type
    static String getString() {
        return "Hello World!";
    }

    //method that accepts two integers as parameters and returns an integer that is a sum of the two given integers
    static int addNum(int a, int b) {
        return a + b;
    }

    //conditionals 1:
    static int addNumConditional(int a, int b, boolean tf) {
        if (tf) {
            return a + b;
        } else {
            return a * b;
        }
    }

    //conditionals 2
    static int addNumConditional2(int a, int b) {
        if (a == 0) {
            return b;
        } else
            return a;
    }
}
/*
//arrays. An array that holds 10 integer values and call and output result from Conditionals2.
    int [] arrayOfInts = new int{0,1,2,3,4,5,6,7,8,9};
    for (int i : arrayOfInts){
        System.out.println("Number: " +i);
     }

     //iteration/arrays. Use array from before to create a loop that iterates through the array

     //iteration/array2. create a loop that populates an integer array with values.
*/