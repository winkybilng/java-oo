package practice09;

public class Student extends Person {
    private Klass klass;
    public boolean isAppend = false;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
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

//    public static void main(String args[]) {
//        Klass klass = new Klass(2);
//
//        Student jerry = new Student(1, "Jerry", 8, new Klass(5));
//
//        klass.assignLeader(jerry);
//        System.out.println(jerry.equals(klass.getLeader()));
//    }

}

