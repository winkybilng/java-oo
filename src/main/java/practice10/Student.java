package practice10;

public class Student extends Person{
    private Klass klass;
    public boolean isAppend = false;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
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
