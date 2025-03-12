/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author putra
 */
public class Player1Frame extends JFrame {
    private JTextField nameField, nimField, majorField;
    private JRadioButton batu, kertas, gunting;
    private JButton nextButton;
    private String player1Choice;

    public Player1Frame() {
        setTitle("Player 1");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nama: "));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("NIM: "));
        nimField = new JTextField();
        add(nimField);

        add(new JLabel("Jurusan: "));
        majorField = new JTextField();
        add(majorField);

        batu = new JRadioButton("Batu");
        kertas = new JRadioButton("Kertas");
        gunting = new JRadioButton("Gunting");
        ButtonGroup group = new ButtonGroup();
        group.add(batu);
        group.add(kertas);
        group.add(gunting);
        JPanel panel = new JPanel();
        panel.add(batu);
        panel.add(kertas);
        panel.add(gunting);
        add(panel);

        nextButton = new JButton("Next");
        add(nextButton);

        nextButton.addActionListener(e -> {
            String player1Name = nameField.getText();
            String player1NIM = nimField.getText();
            String player1Major = majorField.getText();
            if (batu.isSelected()) player1Choice = "Batu";
            else if (kertas.isSelected()) player1Choice = "Kertas";
            else if (gunting.isSelected()) player1Choice = "Gunting";
            dispose();
            new Player2Frame(player1Name, player1NIM, player1Major, player1Choice);
        });

        setVisible(true);
    }
}

