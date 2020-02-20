package the.lessons;

public class lesson1Task6 {
    public static void main(String[] args) {
        isNegative(75);
        isNegative(-76);
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            System.out.println("Результат для числа " + x + " будет: true");
            return true;
        } else {
            System.out.println("Результат для числа " + x + " будет: false");
            return false;
        }
    }
}
