package the.lesson.five;

public class Training {


    public static void main(String[] args) {
        Student[] students = new Student[10];
        Teacher teacher = new Teacher("Petrov", "Sergey", 45);
        Teacher teacher1 = new Teacher("Ivanov", "Viktor", 34);
        StudentGroup studentGroup = new StudentGroup(1, "GroupOne");
        StudentGroup studentGroup1 = new StudentGroup(2, "GroupTwo");


        for (int i = 0; i < 10; i++) {
            students[i] = new Student("StudentSurname" + (i + 1), "StudentName" + (i + 1), 18);
            students[i].choiceTeacher(teacher);



        }
        //studentGroup1.groupEnrollment();
        System.out.println(students);
    }
}

