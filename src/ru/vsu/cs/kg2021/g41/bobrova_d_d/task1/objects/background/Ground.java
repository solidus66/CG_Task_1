package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.DrawableObject;

import java.awt.*;

public class Ground extends DrawableObject {

    public Ground(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(new Color(56, 46, 41, 255));
        g.fillRect(x, y, this.width, this.height);
    }
}
