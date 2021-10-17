package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import java.awt.*;

public class Pumpkin {
    public void drawPumpkin(Graphics2D g, int xPumpkin, int yPumpkin, int radiusPumpkin, int xEyes, int yEyes, int radiusEyes,
                            int xMouth, int yMouth, int width, int height, int startAngle, int arcAngle) {

        // крайние части тыквы
        g.setColor(new Color(176, 113, 0));
        g.fillOval(xPumpkin - 35, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // правая часть
        g.fillOval(xPumpkin - 199, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // левая часть

        g.setColor(new Color(66, 41, 0));
        g.drawOval(xPumpkin - 35, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // правая часть
        g.drawOval(xPumpkin - 199, yPumpkin - radiusPumpkin, 50 + radiusPumpkin, 2 * radiusPumpkin); // левая часть

        // центральная часть тыквы
        g.setColor(new Color(202, 128, 0));
        g.fillOval(xPumpkin - radiusPumpkin, yPumpkin - radiusPumpkin, 70 + radiusPumpkin, 2 * radiusPumpkin);

        g.setColor(new Color(66, 41, 0));
        g.drawOval(xPumpkin - radiusPumpkin, yPumpkin - radiusPumpkin, 70 + radiusPumpkin, 2 * radiusPumpkin);

        // физиономия тыквы
        g.setColor(Color.black);
        g.fillOval(xEyes - radiusEyes, yEyes - radiusEyes, 3 * radiusEyes, 2 * radiusEyes);
        g.fillOval(130 + (xEyes - radiusEyes), yEyes - radiusEyes, 3 * radiusEyes, 2 * radiusEyes);
        g.fillArc(xMouth, yMouth, width, height, startAngle, arcAngle);
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
