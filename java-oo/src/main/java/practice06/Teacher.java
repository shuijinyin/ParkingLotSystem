package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(null != getKlass()){
            return "My name is " + getName() +". I am " + getAge() + " years old. I am a Teacher. I teach Class " + getKlass() + ".";
        }
        return "My name is " + getName() +". I am " + getAge() + " years old. I am a Teacher. I teach No Class.";
    }
}
