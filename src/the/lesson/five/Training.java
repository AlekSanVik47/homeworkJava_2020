package the.lesson.five;

import java.util.ArrayList;

public class Training {
    static void test1() {
        ArrayList<Student> students = new ArrayList<>();
        //null.method(asdgfasgf) NPE
        //null.field = NPE
        students.add(new Student("dfs", "dasfsd"));
    }

    static void testTGS() {
        Group g1 = new Group(), g2 = new Group();
        for (int i = 0; i < 5; i++) {
            g1.addTeacher(new Teacher("TSurnameG1" + i, "TNameG1" + i));
            g2.addTeacher(new Teacher("TSurnameG2" + i, "TNameG2" + i));
        }
        for (int i = 0; i < 10; i++) {
            g1.addStudent(new Student("SSurnameG1" + i, "SNameG1" + i));
            g2.addStudent(new Student("SSurnameG2" + i, "SNameG2" + i));
        }
        Teacher teacher = g1.getTeachers().get(2);
        System.out.println(teacher);
        System.out.println(teacher.getGroups());
        System.out.println(teacher.getStudents(g1));
        Teacher teacher1 = new Teacher("Ivanov", "Ivan");
        teacher1.addToGroup(g2);
        System.out.println(teacher1);
        System.out.println(teacher1.getGroups());
        System.out.println(teacher1.getStudents(g2));
    }

    public static void main(String[] args) {
        Student [] students = new Student[10];
        Teacher teacher = new Teacher("Ivanov", "Ivan");
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("StudentSurname" + (i+1), "StudentName" + (i+1));
            students[i].choiceTeacher(teacher);
        }

        // NPE
        test1();
        testTGS();
    }
}
