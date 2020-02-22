package the.lessons;

public class lesson1Task4 {
    public static void main(String[] args) {
        System.out.println("Результат будет: " + limitOfTenToTwenty(5, 12));
        System.out.println("Результат будет: " + limitOfTenToTwenty(10, 12));

    }

    public static boolean limitOfTenToTwenty(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20)
            return true;
        else return false;

    }
}
