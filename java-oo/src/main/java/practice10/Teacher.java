package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> linkedList = new LinkedList<Klass>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
        //this.klass = klass;
    }

    public LinkedList<Klass> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Klass> linkedList) {
        this.linkedList = linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
//        if (null != getKlass()) {
//            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + getKlass().getNumber() + ".";
//        }
        if (linkedList.size() == 0) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + linkedList.remove(0).getNumber() + haveKlasses() + ".";

        }
    }

    public String haveKlasses() {
        StringBuilder introduce = new StringBuilder();
        for (Klass klass : linkedList) {

            introduce.append(", " + klass.getNumber());
        }
        return introduce.toString();
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber()== linkedList.get(0).getNumber()) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student){
        Klass studentKlass = student.getKlass();
        if(linkedList.contains(studentKlass)){
            return true;
        }else{
            return false;
        }

    }
}
