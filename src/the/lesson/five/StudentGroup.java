package the.lesson.five;

import java.util.ArrayList;

public class StudentGroup {
    private ArrayList<Student> students;

    public int numberStudents;
    public String groupName;
    private Teacher teacher;
    public Student student;
    public  StudentGroup studentGroup;



    public void groupEnrollment () {


            if (student.choiceTeacher(teacher)) ;
            {
                this.studentGroup = studentGroup;
                studentGroup.a(this);
                this.groupName = groupName;


            }
        }

    public StudentGroup( int numberStudents, String groupName){
            this.numberStudents = numberStudents;
            this.groupName = groupName;
            students = new ArrayList<>();

        }

        public ArrayList<Student> getStudents () {
            return students;
        }

        public int getNumberStudents () {
            return numberStudents;
        }

        public String getGroupName () {
            return groupName;
        }

        public Teacher getTeacher () {
            return teacher;
        }

        public Student getStudent () {
            return student;
        }

        @Override
        public String toString () {
            return "StudentGroup{" +
                    "students=" + students +
                    ", numberStudents=" + numberStudents +
                    ", groupName='" + groupName + '\'' +
                    ", teacher=" + teacher +
                    ", student=" + student +
                    '}';
        }

        public void setStudents (ArrayList < Student > students) {
            this.students = students;
        }

        public void setNumberStudents ( int numberStudents){
            this.numberStudents = numberStudents;
        }

        public void setGroupName (String groupName){
            this.groupName = groupName;
        }

        public void setTeacher (Teacher teacher){
            this.teacher = teacher;
        }

        public void setStudent (Student student){
            this.student = student;
        }
    }

