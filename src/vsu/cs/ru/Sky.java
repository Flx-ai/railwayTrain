package vsu.cs.ru;

import java.awt.*;

public class Sky extends DrawingObject {
    public Sky(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(color);
        g.fillRect((int) (cofX * windowWidth),(int) (cofY * windowHeight), (int) (cofW * windowWidth), (int) (cofH * windowHeight));
    }
}
