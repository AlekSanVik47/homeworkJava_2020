package the.lessons.four;

import java.util.Random;
import java.util.Scanner;

public class lesson4task {

    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DEFAULT = '_';
    private static final Random rnd = new Random();
    private static int stepCounter = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер поля для игры");
        int size = in.nextInt();
        char[][] tab = new char[size][size];
        initTable(tab);
        boolean isInGame = true;
        while (isInGame) {
            System.out.println("Введите кординаты:\nномер строки и номер столбца");
            System.out.println();
            print(tab);
            int x = in.nextInt(), y = in.nextInt();
            x--;
            y--;
            if (isValidStep(x, y, tab)) {
                tab[x][y] = DOT_X;
                if (isWin(DOT_X, tab)) {
                    print(tab);
                    System.out.println();
                    System.out.println("Поздравляем Вы победили!!!");
                    return;
                }
                stepCounter++;
                if (stepCounter == size * size) {
                    print(tab);
                    System.out.println();
                    System.out.println("Ничья");
                    return;
                }
                counting(DOT_X, tab);
                // movePC(tab);
                System.out.println("Ход противника");
                for (int i = 0; i < 7; i++) {
                    System.out.print(" * ");
                    Thread.sleep(400);
                }
                System.out.println();
                if (isWin(DOT_O, tab)) {
                    print(tab);
                    System.out.println();
                    System.out.println("Вы проиграли");
                    return;
                }
            }
        }

    }

    private static boolean counting(char symbol, char[][] tab) {
        symbol = DOT_X;
        for (int i = 0; i < tab.length; i++) {
            int line = 0, column = 0, diag1 = 0, diag2 = 0;
            for (int j = 0; j < tab.length; j++) {
                line += tab[i][j] == symbol ? 1 : 0;
                column += tab[j][i] == symbol ? 1 : 0;
                diag1 += tab[j][j] == symbol ? 1 : 0;
                diag2 += tab[j][tab.length - j - 1] == symbol ? 1 : 0;
                if (line == tab.length || column == tab.length || diag1 == tab.length || diag2 == tab.length) {

                    if (line == tab.length - 1 && isValidStep(i, j, tab)) {
                        tab[i][j] = DOT_O;
                        if (column == tab.length - 1 && isValidStep(i, j, tab)) {
                            tab[j][i] = DOT_O;
                            if (diag1 == tab.length - 1 && isValidStep(i, j, tab)) {
                                tab[j][j] = DOT_O;
                                if (diag2 == tab.length - 1 && isValidStep(i, j, tab)) {
                                    tab[j][tab.length - j - 1] = DOT_O;
                                }
                            }
                        }
                        stepCounter++;
                        return true;
                    }

                }


            }


        }
        movePC(tab);
        return false;
    }

    private static void movePC(char[][] tab) {
        while (true) {
            int x = rnd.nextInt(tab.length), y = rnd.nextInt(tab.length);
            if (isValidStep(x, y, tab)) {
                tab[x][y] = DOT_O;
                stepCounter++;
                return;
            }
        }
    }

    private static boolean isWin(char ch, char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < tab.length; j++) {
                sx += tab[i][j] == ch ? 1 : 0;
                sy += tab[j][i] == ch ? 1 : 0;
                d1 += tab[j][j] == ch ? 1 : 0;
                d2 += tab[j][tab.length - j - 1] == ch ? 1 : 0;
                if (sx == tab.length || sy == tab.length || d1 == tab.length || d2 == tab.length) {
                    return true;
                }

            }
        }
        return false;
    }

    private static boolean isValidStep(int x, int y, char[][] tab) {
        int size = tab.length;
        if (x >= 0 && x < size && y >= 0 && y < size) {
            return tab[x][y] == DEFAULT;
        }
        return false;
    }

    private static void print(char[][] tab) {
        System.out.print("   ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tab.length; j++) {
                System.out.print("|" + tab[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }


    private static void initTable(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = DEFAULT;

            }
        }
    }
}
