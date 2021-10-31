package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import java.awt.*;

public class Stars {

    private final double[] x;
    private final double[] y;

    private final int n;

    public Stars(int n, double width, double height) {
        this.n = n;
        x = new double[100];
        y = new double[100];
        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * width;
            y[i] = Math.random() * height;
        }
    }

    public void drawStars(Graphics2D g, int width, int height) {
        g.setColor(new Color(255, 255, 255, 255));
        for (int i = 0; i < n; i++) {
            g.fillOval((int) (x[i] * width), (int) (y[i] * height), 5, 5);
        }
    }
}
