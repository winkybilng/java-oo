package practice09;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;

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
        } else {
            this.leader = null;
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.isAppend = true;
    }

}