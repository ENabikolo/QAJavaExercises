import java.util.ArrayList;

public class Person {
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

/*
ArrayList<object> al = new ArrayList<Object>();
  public void doStuff(person p){
    p.name = "Bob";
        }
        Person person1 = new Person("Jeff");
  doStuff(person1);

    public String toString (){
        return "Name is: " + name + "years old and Age: " + age + "JobTitle: " + jobTitle;

        /*

    System.out.println(Arrays.toString());
    */





