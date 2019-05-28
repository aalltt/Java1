package lesson2_4;

import javafx.fxml.Initializable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class ChatWindow extends JFrame {

    public ChatWindow()  {
        setTitle("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700, 300, 400, 400);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JTextArea jta1 = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta1);
        JTextField jt1 = new JTextField();
        JButton btn1 = new JButton("Отправить");

        panel1.add(jsp);
        panel2.add(jt1);
        panel2.add(btn1);

        setLayout(new BorderLayout());
        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        jsp.setPreferredSize(new Dimension(380, 300));
        jt1.setPreferredSize(new Dimension(250, 30));

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.append(jt1.getText() + "\n");
                jt1.setText("");
            }
        });

        jt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.append(jt1.getText() + "\n");
                jt1.setText("");
            }
        });




        setVisible(true);
    }

}
