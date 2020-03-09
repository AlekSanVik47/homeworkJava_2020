package the.lesson.five;

import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String surname, String name, String patronymic, String position, String email, int age, String phone, long salary) {
        super(surname, name, patronymic, position, email, age, phone, salary);

    }

    @Override
    public String toString() {
        return "Worker{" +
                "ФАМИЛИЯ " + surname + '\'' +
                ", ИМЯ " + name + '\'' +
                ", ОТЧЕСТВО " + patronymic + '\'' +
                ", ДОЛЖНОСТЬ: " + position + '\'' +
                ", EMAIL: " + email + '\'' +
                ", ТЕЛЕФОН: " + phone + '\'' +
                ", ВОЗРАСТ: " + age +
                ", ЗАРПЛАТА: " + salary +
                '}';
    }

    public static void main(String[] args) {
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Иванов", "Иван", "Иванович", "главный инженер", "ivanov@mail.ru", 35, "89887352525", 35000L);
        workersArray[1] = new Worker("Петров", "Петр", "Сергеевич", "энергетик", "petrovv@mail.ru", 41, "89887352535", 32000L);
        workersArray[2] = new Worker("Семенов", "Сергей", "Федорович", "начальник отдела", "semenov@mail.ru", 45, "89887352565", 30000L);
        workersArray[3] = new Worker("Леонов", "Петр", "Валерьевич", "логист", "leonov@mail.ru", 30, "89887352555", 28000L);
        workersArray[4] = new Worker("Светлов", "Михаил", "Александрович", "водитель", "ivanov@mail.ru", 27, "89887352599", 25000L);
        for (int i = 0; i < workersArray.length; i++) {
            if (workersArray[i].age > 40){
                System.out.println(Arrays.toString(new Worker[]{workersArray[i]}));
            }

        }
    }
}
