package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    LinkedList<Klass> classes = new LinkedList<Klass>();

    public LinkedList<Klass> getClasses() {
        return classes;
    }
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.setTeacher(this);
        }
        }


    public String introduce() {
        if (classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String s = "";
            for (Klass klass : classes) {
                s = s+klass.getNumber()+", ";
            }
            return super.introduce() + " I am a Teacher. I teach Class "+s.substring(0,s.length()-2)+".";

        }
    }

    public boolean isTeaching(Student student) {

        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {

        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }

    }

}

