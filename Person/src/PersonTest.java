import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

public class PersonTest {
    Person p;
    String name;
    int age;
    String jobTitle;

    @Before
    public void setUp (){
        Person p = new Person(name, age, jobTitle);
        name = "James";
        age = 22;
        jobTitle = "Mechanic";

        ArrayList<Person> p = new ArrayList<Person>();
        p.add(new Person("James", 22, "Mechanic"));
        p.add(new Person("Peter", 36, "Travel Blogger"));
        p.add(new Person("Joanne",28, "Aerospace Engineer"));
        p.add(new Person("Clare", 39, "Web Developer"));
        System.out.println(p);


    @Test
    public void getName() { p.getName();{
        assertEquals(name, p.getName());
    }

     @Test
    public void testgetAge(){

        assertEquals(age, p.getAge());
 }

    @Test
    public void testgetjobTitle(){
     assertEquals(jobTitle, tes.getjobTitle());
 }
}