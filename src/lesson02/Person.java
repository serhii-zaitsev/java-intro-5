package lesson02;

import java.util.Objects;

public class Person {

    private String firstName;
    private String secondName;
    private int age;

    private static int count = 0;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    Person(String firstName, String secondName, int age)
        {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            count++;
        }

    void DoSomething()
        {
             String end = " is doing something. ";
             System.out.println(firstName + " " + secondName + end);
        }
    static
        {
            System.out.println("First class loading.");
        }
        {
            System.out.println(count + " class loading."); //always loading
        }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Leo", "Messi", 32);
        Person person2 = new Person("Leo", "Messi", 32);
        Person person3 = new Person("Ney", "Brasil", 25);
        System.out.println("Comparing class by == " + (person1 == person2));
        System.out.println("Comparing classes by equals " + (person1.equals(person2)));
        System.out.println("Comparing string firstName by equals " + person1.firstName.equals(person2.firstName));
        System.out.println("Comparing string firstName by ==     " + person1.firstName == person2.firstName);

        System.out.println("Comparing object by hash ==     " + (person1.hashCode() == person2.hashCode()));
        System.out.println("Comparing object by hash ==     " + (person1.hashCode() == person3.hashCode()));


        System.out.println("Using ToString " + person1.toString());
        System.out.println("Using ToString " + person2.toString());
        System.out.println("Using ToString " + person3.toString());

        System.out.println("HAsh code person1 " + person1.hashCode());
        System.out.println("HAsh code person2 " + person2.hashCode());
        System.out.println("HAsh code person3 " + person3.hashCode());

    }
}
