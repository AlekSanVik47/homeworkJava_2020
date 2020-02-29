package the.lessons.two.lesson1;

public class Lesson2Task5 {

    public static void main(String[] args) {
        minAndMaxNumber();
    }

    public static void minAndMaxNumber() {
        int[] arrNumber = new int[]{5, 7, 10, 3, 87, 124, 62, 22};
        int min = arrNumber[0];
        int max = arrNumber[0];

        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] < min) {
                min = arrNumber[i];
            }
            if (arrNumber[i] > max) {
                max = arrNumber[i];
            }

        }
        System.out.println("Минимальное число: " + min + "\n" + "Максимальноное число: " + max);
    }
}