package vsu.cs.ru.trainComponents;

import vsu.cs.ru.DrawingObject;

import java.awt.*;

public class Label extends DrawingObject {

    public Label(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(color);
        g.setFont(new Font("TimesNewRoman", Font.ITALIC, (int) (0.026 * windowHeight)));
        g.drawString("Voronezh - Makhachkala", (int) (cofX * windowWidth), (int) (cofY * windowHeight));
    }
}
