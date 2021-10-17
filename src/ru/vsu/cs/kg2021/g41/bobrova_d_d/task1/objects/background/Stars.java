package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import java.awt.*;

public class Stars {
    private static double[] x;
    private static double[] y;

    static {
        x = new double[100];
        y = new double[100];
        for (int i = 0; i < 100; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
        }
    }

    public void drawStars(Graphics2D g, int n, int w, int h) {
        g.setColor(new Color(255, 255, 255, 255));
        for (int i = 0; i < n; i++) {
            g.fillOval((int) (x[i] * w), (int) (y[i] * h), 5, 5);
        }
    }
}
