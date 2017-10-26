
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

        public String toString() {
            return ("Name: " + name + " Age " + age + " I am a " + jobTitle);
        }

        public String getName() {

            return name;
        }

        public int getAge() {

            return age;
        }

        public String getjobTitle() {

            return jobTitle;
        }

    }
}
