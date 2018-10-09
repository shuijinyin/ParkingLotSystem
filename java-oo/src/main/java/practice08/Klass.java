package practice08;

public class Klass {
    private Integer number;
    private Student student;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        this.student = student;
    }

    public Student getLeader() {
        return student;
    }
}
