package the.lessons.two.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeworkTask1 {
    public static void main(String[] args) {
        guessARandomNumber();

    }

    public static void guessARandomNumber() {
        Random rand = new Random();
        int x = rand.nextInt(9);
        System.out.println("Введите целое число от 0 до 9-ти  \nУ Вас 3 попытки");

        for (int i = 0; i < 3; i++) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a == x && i <= 2) {
                System.out.println("Поздравляем Вы угадали!");
                return;
            }
            if (a < x && i < 2) {
                System.out.println("Вы вели число меньше\nПопробуйте еще раз ");
            } else if (a > x && i < 2) {
                System.out.println("Вы вели число больше\nПопробуйте еще раз ");
            } else if (i == 2 && a != x) {
                System.out.println("К сожалению вы не угадали\nПовторить игру еще раз? \\n нажмите: 1 – да / 0 – нет :  \"");
                int b = sc.nextInt();
                if (b == 1) {
                    guessARandomNumber();
                } else break;

            }
        }
    }
}



