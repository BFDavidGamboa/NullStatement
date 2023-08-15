// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class NullStatement {
    public static void main(String[] args) {
        Person person1 = new Person("Juan");
        System.out.println(("person 1: ")+ person1.getName());

        Person person2 = person1;
        System.out.println("persona2: " + person2.getName());

        person1 = null;

        if(person1 != null)
            System.out.println("person1 " + person1.getName());
        else
            System.out.println("The person1 variable does not point to any object");

        person2 = null;

        System.gc();
    }
}

class Person{
    String name;

    Person (String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}