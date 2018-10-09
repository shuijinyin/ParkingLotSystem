package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(null != getKlass()){
            return "My name is " + getName() +". I am " + getAge() + " years old. I am a Teacher. I teach Class " + getKlass().getNumber() + ".";
        }
        return "My name is " + getName() +". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(getKlass().getNumber().equals(student.getKlass().getNumber())){
            return "My name is " + getName() + ". I am "+ getAge() +" years old. I am a Teacher. I teach "+ student.getName() +".";
        }
        return "My name is " + getName() + ". I am "+ getAge() +" years old. I am a Teacher. I don't teach "+ student.getName() +".";
    }
}
