package the.lessonEighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Game extends JFrame {

    private int cnt = 0;

    public Game() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocation(300, 300);
        setVisible(true);
        //FlowLayout один за одним
        //BorderLayout EAST WEST CENTER
        //GridLayout row col
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton[][] table = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
                        if (cnt == 9){
                            this.dispose();
                            AlertDialog dialog = new AlertDialog();
                            dialog.setResultMessage("НИЧЬЯ");
                        }
                        if (cnt < 9) {
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
