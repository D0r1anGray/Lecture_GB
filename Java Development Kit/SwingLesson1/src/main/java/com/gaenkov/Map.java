package com.gaenkov;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel{
    public Map() {
        setBackground(Color.GREEN);
    }

    void startNewGame(int mode, int sizeX, int sizeY, int length){
        System.out.printf("Mode: %d; \n Size: x = %d, y = %d; \n Length = %d",
                mode, sizeX, sizeY, length);
    }
}
