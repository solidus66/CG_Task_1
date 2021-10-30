package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import java.awt.*;

public class Pumpkin {

    private final int xPumpkin;
    private final int yPumpkin;
    private final int radiusPumpkin;
//    private final int xEyes;
//    private final int yEyes;
//    private final int radiusEyes;
    //    private int xMouth;
//    private int yMouth;
//    private int width;
//    private int height;
//    private int startAngle;
//    private int arcAngle;

    public Pumpkin(int xPumpkin, int yPumpkin, int radiusPumpkin /*, int xEyes, int yEyes, int radiusEyes int xMouth, int yMouth, int width, int height  int startAngle, int arcAngle*/) {
        this.xPumpkin = xPumpkin;
        this.yPumpkin = yPumpkin;
        this.radiusPumpkin = radiusPumpkin;
//        this.xEyes = xEyes;
//        this.yEyes = yEyes;
//        this.radiusEyes = radiusEyes;
//        this.xMouth = xMouth;
//        this.yMouth = yMouth;
//        this.width = width;
//        this.height = height;
//        this.startAngle = startAngle;
//        this.arcAngle = arcAngle;
    }

    public void drawPumpkin(Graphics2D g) {

        // крайние части тыквы
        g.setColor(new Color(176, 113, 0));
        //g.fillOval(xPumpkin - 35, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // правая часть
        //g.fillOval(xPumpkin - 199, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // левая часть
        g.fillOval((int) (xPumpkin - (xPumpkin / 14.5)), yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin);
        g.fillOval((int) (xPumpkin - (xPumpkin / 2.3)), yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin);

        g.setColor(new Color(66, 41, 0));
        //g.drawOval(xPumpkin - 35, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // правая часть
        //g.drawOval(xPumpkin - 199, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // левая часть
        g.drawOval((int) (xPumpkin - (xPumpkin / 14.5)), yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin);
        g.drawOval((int) (xPumpkin - (xPumpkin / 2.3)), yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin);

        // центральная часть тыквы
        g.setColor(new Color(202, 128, 0));
        g.fillOval(xPumpkin - radiusPumpkin, yPumpkin - radiusPumpkin, 70 + radiusPumpkin, 2 * radiusPumpkin);

        g.setColor(new Color(66, 41, 0));
        g.drawOval(xPumpkin - radiusPumpkin, yPumpkin - radiusPumpkin, 70 + radiusPumpkin, 2 * radiusPumpkin);

//        // физиономия тыквы
//        g.setColor(Color.black);
//        g.fillOval(xEyes - radiusEyes, yEyes - radiusEyes, 2 * radiusEyes, 2 * radiusEyes);
//        g.fillOval(90 + (xEyes - radiusEyes), yEyes - radiusEyes, 2 * radiusEyes, 2 * radiusEyes);
//        //g.drawArc(xMouth, yMouth, width, height, startAngle, arcAngle);
//        g.drawArc(xPumpkin - 41, yPumpkin, 36, 36, 180, 180);
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
