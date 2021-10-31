package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final World world;

    public DrawPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        world = new World();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        world.paint(gr);
    }
}
