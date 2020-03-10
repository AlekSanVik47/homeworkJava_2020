package the.lessone.six;

import java.util.Arrays;

public class Cat extends Animals {
    protected boolean sail;

    public Cat(String nickname, int run, boolean sail, double jump) {
        super(nickname);
        this.nickname = nickname;
        this.run = run;
        this.sail = sail;
        this.jump = jump;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "КЛИЧКА: " + nickname +
                ", ПРОПЛЫЛ: " + sail + '\'' +
                ", Пробежал: " + run + " метров" +
                ", ПРЫГНУЛ НА ВЫСОТУ: " + jump + " метра" +
                '}';
    }

    public void catInfo() {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 150, false, 1.25);
        cats[1] = new Cat("Тишка", 90, false, 1.5);
        cats[2] = new Cat("Снежок", 180, false, 2);
        cats[3] = new Cat("Перс", 200, false, 1.6);
        cats[4] = new Cat("Дымка", 120, false, 1.25);
        for (int i = 0; i < cats.length; i++) {

            System.out.println(Arrays.toString(new Cat[]{cats[i]}));

            //System.out.println("Кличка кота: " + nickname + "\n" + "пробежал: " + run + " метров\n" + "проплыл " + sail + "\nпрыгнул на высоту: " + jump + " метра");

        }
    }
}
