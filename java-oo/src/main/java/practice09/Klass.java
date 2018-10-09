package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    //private Student student;
    private Student leader;
    private List<Student> students = new ArrayList<Student>();

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }


    public void assignLeader(Student student) {

        if(students.contains(student)){
            this.leader= student;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }



    public void appendMember(Student student){
        students.add(student);
    }
}
