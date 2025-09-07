import java.util.Objects;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int age;

    public Person(String ID, String firstName, String lastName, String title, int age) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.age = age;

        //return type is redundant
        //class name is capitalized, not camel case
    }

    public String toString() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + age;
    } //quick way to debug
    // called in Tester to print


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    //doesnt have a return value bcause just set ID value to getID's return value


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(ID, person.ID) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }
    //compare to objects to see if their values are the same

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, title, age);
    }
    //create unique keys for each object

    public String getFullName() {
        return firstName + " " + lastName;
    }
    //custom function

    public String getFormalName() {
        return title + " " + firstName + " " + lastName;
        //shouldn't call the method getFullName bc its performance redundant
        //more cost-effective to just write the simple line of code
        //waste processing time

    }
}
