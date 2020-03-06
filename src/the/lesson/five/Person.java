package the.lesson.five;

public class Person {

    protected String name, suname;
    private int age;


    public Person(String suname, String name, int age) {
        this.name = name;
        this.suname = suname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    protected void addStudent(Student student) {
    }
}
