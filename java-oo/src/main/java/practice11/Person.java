package practice11;

public class Person {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public String introduce(){
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof Person){
//            Person o = (Person) obj;
//            return this.id == o.id;
//        }
        return id == ((Person) obj).getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}
