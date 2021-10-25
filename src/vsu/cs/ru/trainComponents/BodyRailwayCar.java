package vsu.cs.ru.trainComponents;

import vsu.cs.ru.DrawingObject;

import java.awt.*;

public class BodyRailwayCar extends DrawingObject {
    private Color firstColor;
    private Color secondColor;

    public BodyRailwayCar(double cofX, double cofY, double cofW, double cofH, Color firstColor, Color secondColor) {
        super(cofX, cofY, cofW, cofH);
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(firstColor);
        g.fillRect((int) (cofX * windowWidth),(int) (cofY * windowHeight), (int) (cofW * windowWidth), (int) (cofH * windowHeight));
        g.setColor(secondColor);
        g.fillRect((int) (cofX * windowWidth - cofW * windowWidth * 0.07), (int) (cofY * windowHeight - 0.095 * cofH * windowHeight), (int) (cofW * windowWidth * 1.14),(int) (0.1 * cofH * windowHeight));
        g.setColor(Color.WHITE);
    }
}
