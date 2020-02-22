package the.lessons;

public class Lesson1Task8 {
    public static void main(String[] args) {
        leapYearOrNot(1600);
        leapYearOrNot(1603);
        leapYearOrNot(1900);
        leapYearOrNot(1902);
        leapYearOrNot(2000);
        leapYearOrNot(2001);
        leapYearOrNot(2016);
        leapYearOrNot(2018);
        leapYearOrNot(2020);


    }

    public static boolean leapYearOrNot(int year) {
        if ((year % 4 == 0) || (year % 400 == 0) || (year % 100 == 0)) {
            System.out.println(year + "г. - високосный год");
            return true;
        } else {
            System.out.println(year + "г. - невисокосный год");
            return false;
        }

    }
}

