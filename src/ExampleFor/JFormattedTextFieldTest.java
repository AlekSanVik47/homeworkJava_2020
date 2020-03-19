package ExampleFor;

import the.lessonEighth.the.lessonEighth.Game;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class JFormattedTextFieldTest extends JFrame {
    int size;

    public JFormattedTextFieldTest() throws HeadlessException {

        setTitle("КРЕСТИКИ НОЛИКИ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        NumberFormat number = new DecimalFormat("##");
        JFormattedTextField FieldSize = new JFormattedTextField(new NumberFormatter());
        FieldSize.setColumns(2);
        FieldSize.setValue(3);
        JButton ok = new JButton("NEW GAME"), close = new JButton("CLOSE");
        ok.addActionListener(ev -> {
            new Game();
            dispose();
        });
        close.addActionListener(ev -> {
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("ВВЕДИТЕ РАЗМЕР ПОЛЯ :"));
        panel.add(FieldSize);
        panel.add(ok);
        panel.add(close);
        add(panel);
        
        //FieldSize.setText(String.valueOf(size));

        setVisible(true);
    }


}
