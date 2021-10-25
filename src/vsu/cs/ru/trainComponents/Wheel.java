package vsu.cs.ru.trainComponents;

import vsu.cs.ru.DrawingObject;

import java.awt.*;

public class Wheel extends DrawingObject {
    private Color firstColor;
    private Color secondColor;

    public Wheel(double cofX, double cofY, double cofW, double cofH, Color firstColor, Color secondColor) {
        super(cofX, cofY, cofW, cofH);
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(firstColor);
        g.fillOval(((int) (cofX * windowWidth - 0.025 * windowWidth)), (int) (cofY * windowHeight - 0.025 * windowWidth), (int) (0.025 * windowWidth * 2), (int) (0.025 * windowWidth * 2));
        g.setColor(secondColor);
        g.fillOval((int) (cofX * windowWidth - 0.01875 * windowWidth), (int) (cofY * windowHeight - 0.01875 * windowWidth), (int) (0.01875 * windowWidth * 2), (int) (0.01875 * windowWidth * 2));
    }
}
