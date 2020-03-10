package the.lesson.five;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> students = null;
    private ArrayList<Teacher> teachers = null;
    private static int counter = 0;
    private int id;

    public Group() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        counter++;
        id = counter;
    }

    @Override
    public String toString() {
        return "Group_" + id;
    }

    //alt + insert
    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        if (!teacher.getGroups().contains(this)) {
            teacher.getGroups().add(this);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> origin/lessonFive
