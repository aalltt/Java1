package lesson1_8;

/*
Сделать окно с кнопкой вызова второго окна. Во втором окне ввести данные, которые должны отобразиться в
в первом окне.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame {
    AddWindow addWindow;
    JLabel jlb1;

    public MainWindow() {
        setTitle("Заполенние данных");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jlb2 = new JLabel("ФИО");
        jlb1 = new JLabel(" ");
        JPanel panel1 = new JPanel(new GridLayout(1, 2));

        panel1.add(jlb2);
        panel1.add(jlb1);
        setVisible(true);
        JButton btn1 = new JButton("Ввести данные");
        add(panel1, BorderLayout.NORTH);
        add(btn1, BorderLayout.SOUTH);
        setBounds(300, 300, 400, 222);

        addWindow = new AddWindow(this);
        addWindow.setVisible(false);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addWindow.setVisible(true);
                setEnabled(false);
            }
        });
    }

    void getdd(String a, String b, String c) {
        jlb1.setText(a + " " + b + " " + c);
    }

}
