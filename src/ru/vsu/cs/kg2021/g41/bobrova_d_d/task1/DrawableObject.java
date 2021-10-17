package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import java.awt.*;

public abstract class DrawableObject {
    protected int x, y, width, height;

    public DrawableObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void draw(Graphics2D g, int w, int h);
}
