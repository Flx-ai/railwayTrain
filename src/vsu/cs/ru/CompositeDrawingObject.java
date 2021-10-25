package vsu.cs.ru;

import java.awt.*;
import java.util.ArrayList;

public class CompositeDrawingObject extends DrawingObject {
    private ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

    public CompositeDrawingObject(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);
    }

    public void addDrawingObject(DrawingObject drawingObjects) {
        this.drawingObjects.add(drawingObjects);
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        for (DrawingObject drawingObject : drawingObjects) {
            drawingObject.draw(g, windowWidth, windowHeight);
        }
    }
}
