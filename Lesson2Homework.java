package the.lessons.two.lesson1;

import java.util.Arrays;

public class Lesson2Homework {

    //Task1
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("lesson_ 2 Task_1");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    // Task2
    public static void fillArray() {
        int[] arr = new int[8];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            arr[i] = i * 3;
        }
        System.out.println("lesson_2 Task_2");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    //Task3
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6){
                w[i] = w[i] * 2;
            }
        }
        System.out.println("lesson_ 2 Task_3");
        System.out.println(Arrays.toString(w));
        System.out.println();
    }

    //Task4
    public static void fillDiagonal() {
        System.out.println("lesson_ 2 Task_4");

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || j == 5 - (i + 1)){
                    arr[i][j] = 1;
                } else arr[i][j] = 0;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }
}

