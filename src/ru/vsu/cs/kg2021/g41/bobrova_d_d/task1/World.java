package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Text;
import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.*;

import java.awt.*;

public class World {

    private final Ground ground;
    private final Headstone headstone;
    private final Sky sky;
    private final Text text;
    private final Pumpkin pumpkin;
    private final Stars stars;

    public World() {
        ground = new Ground(0,400,1920,685);
        headstone = new Headstone(120, 330, 100, 200);
        sky = new Sky(0,0, 1920, 1080);
        text = new Text(130,150,0,0);
        pumpkin = new Pumpkin(305, 260, 400, 300);
        stars = new Stars(10, 1, 0.5);
    }

    public void paint(Graphics2D gr) {
        sky.draw(gr, 1920, 1080);
        ground.draw(gr,1920, 685);
        headstone.draw(gr, 100, 200);
        stars.drawStars(gr, 800, 600);

        text.draw(gr, 130, 150);

        pumpkin.drawPumpkinHaulm(gr, 390, 220, 30, 80);
        pumpkin.drawPumpkinShadow(gr, 410, 535, 120);
        pumpkin.drawPumpkin(gr);
        pumpkin.drawPumpkinFace(gr);
    }
}
