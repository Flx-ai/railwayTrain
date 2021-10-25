package vsu.cs.ru.trainComponents;

import vsu.cs.ru.DrawingObject;

import java.awt.*;

public class AutomaticCoupling extends DrawingObject {

    public AutomaticCoupling(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);

    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(color);
        g.fillRect((int) (cofX * windowWidth),(int) (cofY * windowHeight), (int) (cofW * windowWidth / 2), (int) (cofH * windowHeight));
    }
}
