package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Stars;
import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Pumpkin;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final World world;
    private final Pumpkin pumpkin;
    private final Stars stars;

    public DrawPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        world = new World();
        pumpkin = new Pumpkin(432, 400, 120, 363, 420, 13);
//        pumpkin = new Pumpkin(432, 400, 120, 363, 420,
//                13, 392, 410, 36, 36, 180, 180);
        stars = new Stars(10, 1, 0.5);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        world.paint(gr);

        stars.drawStars(gr, 800, 600);

        pumpkin.drawPumpkinHaulm(gr, 390, 220, 30, 80);
        pumpkin.drawPumpkinShadow(gr, 410, 535, 120);
        pumpkin.drawPumpkin(gr);
    }
}
