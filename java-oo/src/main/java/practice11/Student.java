package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {

        if (null != getKlass().getLeader()) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of Class " + getKlass().getNumber() + ".";
        }
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class " + getKlass().getNumber() + ".";
    }
}
