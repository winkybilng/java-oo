package practice06;

import javax.print.attribute.standard.NumberUp;

public class Teacher extends Person {
    private int klass;
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int kclass) {
        this.klass = kclass;
    }

    public String introduce() {
        if (klass == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";

        } else {
            return super.introduce() + " I am a Teacher. I teach Class "+klass+".";
        }
    }
}
