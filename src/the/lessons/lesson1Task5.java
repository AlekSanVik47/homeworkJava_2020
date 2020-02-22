package the.lessons;

public class lesson1Task5 {

    public static void main(String[] args) {
        isPositiveOrNegative(15);
        isPositiveOrNegative(0);
        isPositiveOrNegative(-55);

    }

    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }
}



