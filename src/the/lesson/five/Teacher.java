package the.lesson.five;

import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<StudentGroup> students;

    public Teacher(String suname, String name, int age) {
        super(suname, name, age);
        students = new ArrayList<>();
    }
    public ArrayList<StudentGroup> getStudents() {
        return students;
    }
    public void addStudent(StudentGroup student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", suname='" + suname + '\'' +
                '}';
    }
}
