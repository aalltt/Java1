package lesson1_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddWindow extends JFrame {
    MainWindow mainWindow;

    public AddWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setTitle("Заполенние данных");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700, 300, 400, 400);

        JPanel panel1 = new JPanel(new GridLayout(1, 3));

        JButton btn1 = new JButton("Подтвердить");

        JTextField jt1 = new JTextField();
        JTextField jt2 = new JTextField();
        JTextField jt3 = new JTextField();
        panel1.add(jt1);
        panel1.add(jt2);
        panel1.add(jt3);


        setLayout(new BorderLayout());
        add(panel1, BorderLayout.NORTH);
        add(btn1, BorderLayout.SOUTH);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.getdd(jt1.getText(), jt2.getText(), jt3.getText());
                mainWindow.setEnabled(true);
                setVisible(false);
            }
        });
        setVisible(true);
    }


}
