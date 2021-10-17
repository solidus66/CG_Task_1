package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.DrawableObject;

import java.awt.*;

public class Headstone extends DrawableObject {

    private final int startAngle;
    private final int arcAngle;

    public Headstone(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.startAngle = 0;
        this.arcAngle = 180;
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(new Color(51, 51, 51));
        g.setStroke(new BasicStroke(4));
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
}
