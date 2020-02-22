package the.lessons;

public class lesson1Task3 {

    public static void main(String[] args) {
        float a = 0, b = 0, c = 0, d = 0;
        float result = calculate(a, b, c, d);
    }

    public static float calculate(float a, float b, float c, float d) {
        a = 10.25f;
        b = 11.75f;
        c = 3f;
        d = 4f;
        float result = (a * (b + (c / d)));
        System.out.println("Результат расчета будет равен: " + result);
        return result;
    }
}

