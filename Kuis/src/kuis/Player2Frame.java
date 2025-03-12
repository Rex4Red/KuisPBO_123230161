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

public class Player2Frame extends JFrame {
    private JTextField nameField, nimField, majorField;
    private JRadioButton batu, kertas, gunting;
    private JButton battleButton;
    private String player1Name, player1NIM, player1Major, player1Choice;

    public Player2Frame(String p1Name, String p1NIM, String p1Major, String p1Choice) {
        this.player1Name = p1Name;
        this.player1NIM = p1NIM;
        this.player1Major = p1Major;
        this.player1Choice = p1Choice;
        setTitle("Player 2");
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

        battleButton = new JButton("Battle");
        add(battleButton);

        battleButton.addActionListener(e -> {
            String player2Name = nameField.getText();
            String player2NIM = nimField.getText();
            String player2Major = majorField.getText();
            String player2Choice = batu.isSelected() ? "Batu" : kertas.isSelected() ? "Kertas" : "Gunting";
            dispose();
            new ResultFrame(player1Name, player1NIM, player1Major, player1Choice, player2Name, player2NIM, player2Major, player2Choice);
        });

        setVisible(true);
    }
}


