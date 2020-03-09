package the.lesson.five;

public class Employee {
    String surname, name, patronymic, position, email, phone;
    int age;
    long  salary;

    public Employee(String surname, String name, String patronymic, String position, String email, int age, String phone, long salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }
    public void employeeInfo(){
        System.out.println("Ф.И.О\n"
                + surname + " " + name + " " + patronymic + "\n"
                + "ДОЛЖНОСТЬ: " + position + " EMAIL: " + email + "\n"
                + "ТЕЛЕФОН: " + phone + " ЗАРПЛАТА:" + salary + " ВОЗРАСТ: " + age);
    }
}
