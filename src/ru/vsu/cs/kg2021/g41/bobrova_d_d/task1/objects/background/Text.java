package ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.objects.background;

import ru.vsu.cs.kg2021.g41.bobrova_d_d.task1.DrawableObject;

import java.awt.*;

public class Text extends DrawableObject {

    public Text(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int w, int h) {
        g.setColor(new Color(202, 128, 0));
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 66));
        g.drawString("Happy Halloween!", x, y); //130 , 150
    }
}
