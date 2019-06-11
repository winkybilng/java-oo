package practice11;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class "+ number;

    }
    public void assignLeader(Student student) {
        if (student.isAppend) {
            this.leader = student;
            if(this.getTeacher() != null){
                System.out.print("I am "+this.getTeacher().getName()+". I know "+student.getName()+" become Leader of Class "+this.number+".\n");

            }

        } else {
            this.leader = null;
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.isAppend = true;
        if(this.getTeacher() != null){
            System.out.print("I am "+this.getTeacher().getName()+". I know "+student.getName()+" has joined Class "+this.number+".\n");

        }

    }

    public boolean isIn(Student student) {
        return student.getKlass().number == this.number;
    }

}
