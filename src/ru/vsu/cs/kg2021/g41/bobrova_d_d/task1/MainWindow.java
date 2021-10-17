package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException {
        DrawPanel drawPanel = new DrawPanel();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        this.add(drawPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
}

