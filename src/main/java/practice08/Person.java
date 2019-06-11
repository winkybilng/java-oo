package practice08;

public class Person {
    private String name;
    private int age;
    private int id;


    public Person(int id,String name,int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }

    @Override
    public int hashCode() {
        return id;
    }

    public boolean equals(Object person) {
      return this.id == person.hashCode();
    }
}
