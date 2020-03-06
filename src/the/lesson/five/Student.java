package the.lesson.five;

public class Student extends Person{

    private Teacher teacher;

    public Student(String suname, String name, int age) {
        super(suname, name, age);
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public boolean choiceTeacher(Teacher teacher){

        this.teacher = teacher;
        teacher.addStudent(this);
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", suname='" + suname + '\'' +
                '}';
    }
}
