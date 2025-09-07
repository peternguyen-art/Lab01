public class Tester {
    public static void main(String[] args) {
        Person peter = new Person("123456","Peter","Nguyen","Mr.",20);
        System.out.println(peter.toString());
        // toString method built in java class convert object into string

        System.out.println(peter.getAge());

        peter.setAge(21);

        System.out.println(peter.getAge());

        // set = overwrite the method to write a specific value
        // overloading a method

        Person sally = new Person("123456","Sally","Tran","Ms.",22);

        System.out.println(sally);

        System.out.println(sally.getFormalName());
        System.out.println(sally.getFullName());
    }

}
