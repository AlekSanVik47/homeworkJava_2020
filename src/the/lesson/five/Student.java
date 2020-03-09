package the.lesson.five;

import java.util.ArrayList;

public class Student extends Person {

    private Group group = null;

    public Student(String surname, String name) {
        super(surname, name);
    }

    public void addToGroup(Group group) {
        group.addStudent(this);
    }

    public ArrayList<Teacher> getTeachers() {
        return group == null ? null : group.getTeachers();
    }

    public ArrayList<Student> getSameGroupMembers() {
        if (group == null) {
            return null;
        }
        ArrayList<Student> students = group.getStudents();
        students.remove(this);
        return students;
    }

    public boolean choiceTeacher(Teacher teacher) {
        //all groups
        ArrayList<Group> groups = teacher.getGroups();
        if (groups.isEmpty()) {
            return false;
        }
        int minSize = groups.get(0).getStudents().size(), pos = 0;
        int counter = 0;
        for (Group group : groups) {
            if (group.getStudents().size() < minSize) {
                minSize = group.getStudents().size();
                pos = counter;
            }
            counter++;
        }
        groups.get(pos).addStudent(this);
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}