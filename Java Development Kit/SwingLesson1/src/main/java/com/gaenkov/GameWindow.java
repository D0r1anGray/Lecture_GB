package com.gaenkov;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame{
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 800;
    private static final int WINDOW_POSY = 300;

    JButton btnStart = new JButton("Начать игру");
    JButton btnExit = new JButton("Выход");

    public GameWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window when game ends.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // SIZE of window.
        setLocation(WINDOW_POSX, WINDOW_POSY); //  position of window.
        setTitle("Крестики-нолики");
        setResizable(false);

        Map map = new Map(); // create map.

        JPanel panel = new JPanel(new GridLayout(1, 2)); // create 2 buttons.
        panel.add(btnStart); // add buttons to window.
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH); // add panel to window.
        add(map); // add map to window.

        setVisible(true); // display window.
    }
}
