import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class PersonTest {
    Person p;
    String name;
    int age;
    String jobTitle;

    @Before
    person p = new (name, age, jobTitle);
    name = "James";
    age = 22;
    jobTitle = "Mechanic";

    @Test
    public void testgetName() {
        assertEquals(name, test.getName());
    }

 @Test
    public void testgetAge(){

        assertequals(age, testing.getAge());
 }

 @Test
    public void testgetjobTitle(){
     assertequals(jobTitle, testing.getjobTitle());
 }
}