package vsu.cs.ru.trainComponents;

import vsu.cs.ru.DrawingObject;

import java.awt.*;

public class WindowTrio extends DrawingObject {

    public WindowTrio(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(color);
        for (int i = 0; i < 3; i++) {
            g.fillRect((int) (cofX * windowWidth + i * windowWidth / 13.5), (int) (cofY * windowHeight), (int) (cofW * windowWidth), (int) (cofH * windowHeight ));
        }
    }
}
