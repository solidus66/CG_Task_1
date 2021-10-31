package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import java.awt.*;

public class Pumpkin {

    private int x;
    private int y;
    private int ovalWidth;
    private int ovalHeight;
    private int xEyesLeft;
    private int xEyesRight;

    private int width;
    private int height;

    private final double COF_EYES_X_LEFT = 0.1;
    private final double COF_EYES_X_RIGHT = 0.34;
    private final double COF_EYES_Y = 0.5;

    private final double COF_OVAL_WIDTH = 0.5;
    private final double COF_OVAL_HEIGHT = 0.9;

    private int xEyes;
    private int yEyes;

    public Pumpkin(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.ovalWidth = (int) (COF_OVAL_WIDTH * width);
        this.ovalHeight = (int) (COF_OVAL_HEIGHT * height);


        this.xEyesLeft = x + (int) (COF_EYES_X_LEFT * width);
        this.xEyesRight = x + (int) (COF_EYES_X_RIGHT * width);
        this.yEyes = y + (int) (COF_EYES_Y * height);
    }

    public void drawPumpkin(Graphics2D g) {
        // left & right ovals
        g.setColor(new Color(176, 113, 0));

        g.fillOval(x - 90, y, ovalWidth, ovalHeight);
        g.fillOval(x + 90, y, ovalWidth, ovalHeight);

        g.setColor(new Color(66, 41, 0));

        g.drawOval(x - 90, y, ovalWidth, ovalHeight);
        g.drawOval(x + 90, y, ovalWidth, ovalHeight);

        // central oval
        g.setColor(new Color(202, 128, 0));
        g.fillOval(x, y, ovalWidth, ovalHeight);

        g.setColor(new Color(66, 41, 0));
        g.drawOval(x, y, ovalWidth, ovalHeight);
    }

    public void drawPumpkinFace(Graphics2D g) {
        // pumpkin's physiognomy
        g.setColor(Color.black);
        g.fillOval(xEyesLeft, yEyes, 27, 27);
        g.fillOval(xEyesRight, yEyes, 27, 27);

        g.drawArc(((xEyesLeft + xEyesRight) / 2), yEyes + 10, 36, 36, 180, 180);

    }

    public void drawPumpkinShadow(Graphics2D g, int x, int y, int radius) {
        g.setColor(new Color(0, 0, 0, 87));
        g.fillOval(x - radius, y - radius, 3 * radius, radius - 20);
    }

    public void drawPumpkinHaulm(Graphics2D g, int x, int y, int width, int height) {
        g.setColor(new Color(0x0C2D0C));
        g.drawRect(x, y, width, height);

        g.setColor(new Color(0x195619));
        g.fillRect(x, y, width, height);
    }
}
