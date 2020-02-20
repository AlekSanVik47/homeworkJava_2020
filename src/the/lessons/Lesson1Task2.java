package the.lessons;

public class Lesson1Task2 {
    public static void main(String[] args) {

        byte b = -121;
        short s = 175;
        int i = 3000;
        long val = 5500000L;

        float f = 22.25f;
        double d = 33.325;

        char letter = 'W';

        int c = 7;
        int e = 25;
        boolean m1 = (c > e);
        if ((c > e)) m1 = true;
        else m1 = false;
        System.out.println("Выражение для типа boolean m1: " + m1);
        c = 51;
        e = 33;
        boolean m2;
        if ((c > e)) m2 = true;
        else m2 = false;
        System.out.println("Выражение для типа boolean m2: " + m2);


        System.out.println("Тип byte b: " + b + "\nТип short s:" + s + "\nТип int i: " + i + "\nТип long val: " + val);
        System.out.println("Тип float f: " + f + "\nТип double d: " + d);

    }
}
