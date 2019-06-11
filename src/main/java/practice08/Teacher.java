package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }
    public Teacher(int age, String name, int id) {
        super(age, name, id);
    }
    public Teacher(int age, String name, int id, Klass klass) {
        super(age, name, id);
        this.klass = klass;
    }
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";

        } else {
            return super.introduce() + " I am a Teacher. I teach Class "+klass.getNumber()+".";
        }
    }

    public String introduceWith(Student student) {
        if (this.klass.getNumber() == student.getKlass().getNumber()) {
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
