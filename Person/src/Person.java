
import java.util.ArrayList;

public class Person {


    public class Person{
        private String name;
        private int age;
        private String jobTitle;

        //this. allows you to set a parameter to your field.
        public Person(String name, int age, String jobTitle) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;

        }


        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("James", 22, "Mechanic"));
        people.add(new Person("Peter", 36, "Travel Blogger"));
        people.add(new Person("Joanne",28, "Aerospace Engineer"));
        people.add(new Person("Clare", 39, "Web Developer"));
        System.out.println(people);

        public String toString() {
            return String.format("My name is : " + name + " and I am " + age + " :years old. I work as a " + jobTitle);
        }

        public String getName() {

            return name;
        }

        public int getAge() {

            return age;
        }

        public String jobTitle() {

            return jobTitle;
        }

    }
}
