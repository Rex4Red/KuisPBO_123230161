/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;

/**
 *
 * @author putra
 */
import javax.swing.*;
import java.awt.*;

public class ResultFrame extends JFrame {
    private JLabel resultLabel;
    private JButton resetButton, logoutButton;

    public ResultFrame(String p1Name, String p1NIM, String p1Major, String p1Choice, String p2Name, String p2NIM, String p2Major, String p2Choice) {
        setTitle("Hasil Pertandingan");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        resultLabel = new JLabel(determineWinner(p1Name, p1NIM, p1Major, p1Choice, p2Name, p2NIM, p2Major, p2Choice));
        add(resultLabel);

        resetButton = new JButton("Reset");
        logoutButton = new JButton("Logout");
        JPanel panel = new JPanel();
        panel.add(resetButton);
        panel.add(logoutButton);
        add(panel);

        logoutButton.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        setVisible(true);
    }

    private String determineWinner(String p1Name, String p1NIM, String p1Major, String p1Choice, String p2Name, String p2NIM, String p2Major, String p2Choice) {
        if (p1Choice.equals(p2Choice)) {
            return "Hasil: Seri!";
        } else if ((p1Choice.equals("Batu") && p2Choice.equals("Gunting")) ||
                   (p1Choice.equals("Kertas") && p2Choice.equals("Batu")) ||
                   (p1Choice.equals("Gunting") && p2Choice.equals("Kertas"))) {
            return "Pemenang: " + p1Name + "\nNIM: " + p1NIM + "\nJurusan: " + p1Major + "\nSerangan: " + p1Choice;
        } else {
            return "Pemenang: " + p2Name + "\nNIM: " + p2NIM + "\nJurusan: " + p2Major + "\nSerangan: " + p2Choice;
        }
    }
}