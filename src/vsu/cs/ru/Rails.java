package vsu.cs.ru;

import java.awt.*;

public class Rails extends DrawingObject {
    private Color firstColor;
    private Color secondColor;

    public Rails(double cofX, double cofY, double cofW, double cofH, Color firstColor, Color secondColor) {
        super(cofX, cofY, cofW, cofH);
        this.firstColor = firstColor;
        this.secondColor = secondColor;
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        g.setColor(firstColor);
        g.fillRect((int) (cofX * windowWidth - 0.03125 * windowWidth), (int) (cofY * windowHeight), (int) (cofW * windowWidth), (int) (cofH * windowHeight));
        g.setColor(Color.WHITE);
        for (int i = 0; i < 25; i++) {
            g.fillRect((int) (cofX * windowWidth + i * 85), (int) (cofY * windowHeight + (cofH * windowHeight) / 4), (int) (cofW * windowWidth / 40), (int) (cofH * windowHeight / 2));
        }
    }
}
