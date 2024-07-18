package com.gaenkov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame{
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;

    JButton btnStart = new JButton("Начать игру");
    JButton btnExit = new JButton("Выход");

    Map map;
    SettingsWindow settings;

    public GameWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window when game ends.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // SIZE of window.
        setLocation(WINDOW_POSX, WINDOW_POSY); //  position of window.
        setTitle("Крестики-нолики");
        setResizable(false);

        map = new Map(); // create map.
        settings = new SettingsWindow(this);
        settings.setVisible(false);// create settings window.

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // close window.
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        JPanel panel = new JPanel(new GridLayout(1, 2)); // create 2 buttons.
        panel.add(btnStart); // add buttons to window.
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH); // add panel to window.
        add(map); // add map to window.

        setVisible(true); // display window.
    }

    public void startGame(int mode, int sizeX, int sizeY, int length){
        map.startNewGame(mode, sizeX, sizeY, length);
    }
}
