package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    Image image;

    public DrawPanel() {
        image = new ImageIcon("background.png").getImage();
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(new Color(49, 44, 38));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;

        gr.drawImage(image, 0, 0, null);

        // надгробие
        drawHeadstone(gr, 120, 330, 100, 200, 0, 180);
        drawHeadstone(gr, 590, 380, 50, 100, 0, 180);

        //тыква
        drawPumpkin(gr, 350, 400, 120, 335, 370, 15,
                335, 370, 150, 100, 180, 180);

        // ботва тыквы
        drawPumpkinHaulm(gr, 390, 220, 30, 80);

        gr.setColor(new Color(202, 128, 0));
        gr.setFont(new Font("Comic Sans MS", Font.BOLD, 66));
        gr.drawString("Happy Halloween!", 130 , 150 );
    }

    public void drawPumpkin(Graphics2D g, int xPumpkin, int yPumpkin, int radiusPumpkin, int xEyes, int yEyes, int radiusEyes,
                                   int xMouth, int yMouth, int width, int height, int startAngle, int arcAngle) {
        // сама тыква
        g.setColor(new Color(202, 128, 0));
        g.fillOval(xPumpkin - radiusPumpkin, yPumpkin - radiusPumpkin, 3 * radiusPumpkin, 2 * radiusPumpkin);

        // контур тыквы(исключительно для красоты)
        g.setColor(new Color(66, 41, 0));
        g.drawOval(xPumpkin - radiusPumpkin, yPumpkin - radiusPumpkin, 3 * radiusPumpkin, 2 * radiusPumpkin);

        // физиономия тыквы
        g.setColor(Color.black);
        g.fillOval(xEyes - radiusEyes, yEyes - radiusEyes, 3 * radiusEyes, 2 * radiusEyes);
        g.fillOval(130 + (xEyes - radiusEyes), yEyes - radiusEyes, 3 * radiusEyes, 2 * radiusEyes);
        g.fillArc(xMouth, yMouth, width, height, startAngle, arcAngle);
    }

    public void drawPumpkinHaulm(Graphics2D g, int x, int y, int width, int height) {
        g.setColor(new Color(0x0C2D0C));
        g.drawRect(x, y, width, height);

        g.setColor(new Color(0x195619));
        g.fillRect(x, y, width, height);
    }

    public void drawHeadstone(Graphics2D g, int x, int y, int width, int height, int startAngle, int arcAngle) {
        g.setStroke(new BasicStroke(4));
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }
}
