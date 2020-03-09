package the.lesson.five;

import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<Group> groups;
    private String subject;

    public Teacher(String surname, String name) {
        super(surname, name);
        groups = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addToGroup(Group group) {
        groups.add(group);
        group.addTeacher(this);
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public ArrayList<Student> getStudents(Group group) {
        return group.getStudents();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}