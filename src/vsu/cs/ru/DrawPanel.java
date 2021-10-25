package vsu.cs.ru;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final World world;

    public DrawPanel() {
        world = new World(0, 0, 1, 1, Color.WHITE);
        world.addDrawingObject(new Sand(0, 0.3, 1, 0.7, new Color(0xFFD09443)));
        world.addDrawingObject(new Sky(0, 0, 1, 0.3, new Color(0x08CCEF)));
        world.addDrawingObject(new Rails(0.03125, 0.778, 1, 0.031, Color.BLACK, Color.WHITE));
        for (int i = 0; i < 3; i++) {
            world.addDrawingObject(new TrainCar(0, 0, 1, 1, i,  new Color(163, 140, 222), new Color(12, 245, 144), Color.BLACK, Color.gray, Color.WHITE, new Color(0xFF2B2828)));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        this.world.draw(gr, this.getWidth(), this.getHeight());
    }
}
