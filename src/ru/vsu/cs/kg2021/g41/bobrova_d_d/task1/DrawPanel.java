package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Stars;
import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Pumpkin;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        World world = new World();
        world.paint(gr);

        Stars stars= new Stars();
        stars.drawStars(gr, 10, 800, 300);

        Pumpkin pumpkin = new Pumpkin();
        pumpkin.drawPumpkinShadow(gr, 410, 535, 120);
        pumpkin.drawPumpkin(gr, 432, 400, 120, 335, 370, 15,
                335, 370, 150, 100, 180, 180);

        pumpkin.drawPumpkinHaulm(gr, 390, 220, 30, 80);
    }
}
