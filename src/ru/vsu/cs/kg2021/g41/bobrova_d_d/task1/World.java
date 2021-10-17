package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.Text;
import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background.*;

import java.awt.*;

public class World {
    private final Ground ground;
    private final Headstone headstone;
    private final Sky sky;
    private final Text text;

    public World() {
        ground = new Ground(0,400,800,395);
        headstone = new Headstone(120, 330, 100, 200);
        sky = new Sky(0,0, 800, 600);
        text = new Text(130,150,0,0);
    }

    public void paint(Graphics2D gr) {
        sky.draw(gr, 800, 600);
        ground.draw(gr,800, 395);
        headstone.draw(gr, 100, 200);
        text.draw(gr, 130, 150);
    }
}
