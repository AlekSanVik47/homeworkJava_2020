package the.lessonEighth.the.lessonEighth;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Game extends JFrame {

    private int cnt = 0,  line = 0, column = 0, diag1 = 0, diag2 = 0;;
    private static int size = 5;



    public Game() throws HeadlessException {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocation(300, 300);

        setVisible(true);

        //FlowLayout один за одним
        //BorderLayout EAST WEST CENTER
        //GridLayout row col
        JPanel panel = new JPanel(new GridLayout(size, size));
        JButton[][] table = new JButton[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = new JButton();
                JButton copy = table[i][j];
                copy.setIcon(new ImageIcon("/home/alexandervik/homeTask/src/the/lessonEighth/def.jpg"));
                copy.addActionListener(event ->{
                    if (copy.getText().equals("")) {
                        copy.setText("X");
                        copy.setIcon(new ImageIcon("/home/alexandervik/homeTask/src/the/lessonEighth/X.jpg"));
                        //copy.setEnabled(false);
                        System.out.println(copy.getText());
                        if (isWin("X", table)){
                            System.out.println("X win");
                            this.dispose();
                            AlertDialog dialog = new AlertDialog();
                            dialog.setResultMessage("Вы победили!");
                        }
                        cnt++;
                        if (cnt == size * size){
                            this.dispose();
                            AlertDialog dialog = new AlertDialog();
                            dialog.setResultMessage("НИЧЬЯ");
                        }
                        if (cnt < size * size) {
                            movePC(table);
                        }
                    }
                });
                panel.add(copy);
            }
        }

        add(panel);
        setVisible(true);
    }
    static Random rnd = new Random();



    private  boolean isWin(String ch, JButton[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < tab.length; j++) {
                sx += tab[i][j].getText() == ch ? 1 : 0;
                sy += tab[j][i].getText() == ch ? 1 : 0;
                d1 += tab[j][j].getText() == ch ? 1 : 0;
                d2 += tab[j][tab.length - j - 1].getText() == ch ? 1 : 0;
                if (sx == tab.length || sy == tab.length || d1 == tab.length || d2 == tab.length) {
                    return true;
                }

            }
        }
        return false;
    }
    private void blockThePlayersMove(JButton[][] tab) {

        while (true){
        int x = rnd.nextInt(tab.length);
        int y = rnd.nextInt(tab.length);
        if (!tab[x][y].getText().equals("X") && !tab[x][y].getText().equals("o"))
        


                line += tab[x][y].equals("X") ? 1 : 0;
                column += tab[y][x].equals("X") ? 1 : 0;
                diag1 += tab[y][y].equals("X") ? 1 : 0;
                diag2 += tab[y][tab.length - y - 1].equals("X") ? 1 : 0;

                if (line == tab.length - 1 ) {
                        tab[x][y].setText("o");
                        if (column == tab.length - 1) {
                            tab[y][x].setText("o");
                            if (diag1 == tab.length - 1) {
                                tab[y][y].setText("o");
                                if (diag2 == tab.length - 1 ) {
                                    tab[y][tab.length - y - 1].setText("o");
                                }

                            }
                        }
                        cnt++;
                    }
            movePC(tab);
        }
    }
    private void movePC(JButton[][] tab) {
        while (true) {
            int x = rnd.nextInt(tab.length), y = rnd.nextInt(tab.length);
            if (!tab[x][y].getText().equals("X") && !tab[x][y].getText().equals("o")) {
                tab[x][y].setIcon(new ImageIcon("/home/alexandervik/homeTask/src/the/lessonEighth/O.jpg"));
                tab[x][y].setText("o");
                if (isWin("0", tab)){
                    this.dispose();
                    AlertDialog dialog = new AlertDialog();
                    dialog.setResultMessage("Вы проиграли");
                }
                cnt++;
                return;
            }
        }
    }

    private void wrapButton(JButton button){
        button.setSize(200, 200);
    }

    public static void main(String[] args) {


        new Game();
    }


}
