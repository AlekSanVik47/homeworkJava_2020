package the.lessonEighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WindowGame extends JFrame {

    public WindowGame() throws HeadlessException{
        setSize(640, 480);
        setLocation(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        /*JButton b1 = new JButton(), b2  = new JButton(), b3 = new JButton(); пример с BorderLayout
        wrapButton(b1); wrapButton(b2);wrapButton(b3);
        panel.add(BorderLayout.EAST, b1); panel.add(BorderLayout.CENTER, b2);
        panel.add(BorderLayout.WEST, b3);*/

        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton button = new JButton("0");
        button.addActionListener(actionEvent -> {
            System.out.println(button.getText());
            button.setText(String.valueOf(Integer.parseInt(button.getText()) + 1));
        });
        JTextArea txt = new JTextArea();
        JLabel label = new JLabel();
        panel.add(button);
        panel.add(txt);
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText(String.valueOf(txt.getText().length()));
            }
        });
        panel.add(label);
    }
    public static void main(String[] args) {
        new WindowGame();
    }
}
