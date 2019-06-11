package practice08;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(int age, String name, int id, Klass klass) {
        super(age, name, id);
        this.klass = klass;
    }

    public String introduce() {
        if (this == klass.getLeader()) {
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        } else {
            return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
        }
    }


}
