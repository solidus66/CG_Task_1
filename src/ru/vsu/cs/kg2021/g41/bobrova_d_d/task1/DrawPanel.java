package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Stars;
import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Pumpkin;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final World world;
//    private final Stars stars;

    public DrawPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        world = new World();
//        stars = new Stars(10, 1, 0.5);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        world.paint(gr);
//        stars.drawStars(gr, 800, 600);
    }
}
