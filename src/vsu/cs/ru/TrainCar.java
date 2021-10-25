package vsu.cs.ru;

import vsu.cs.ru.trainComponents.*;
import vsu.cs.ru.trainComponents.Label;
import java.awt.*;

public class TrainCar extends DrawingObject {
    private BodyRailwayCar bodyRailwayCar;
    private Wheel leftWheel;
    private Wheel rightWheel;
    private WindowTrio windowTrio;
    private Label label;
    private AutomaticCoupling leftAutomaticCoupling;
    private AutomaticCoupling rightAutomaticCoupling;

    public TrainCar(double cofX, double cofY, double cofW, double cofH, int serialNumber, Color firstColor, Color secondColor, Color thirdColor,
                    Color fourthColor, Color fifthColor, Color sixthColor) {
        super(cofX, cofY, cofW, cofH);
        this.bodyRailwayCar = new BodyRailwayCar(0.0312 + 0.3 * serialNumber, 0.5, 0.25, 0.22, firstColor, secondColor);
        this.leftWheel = new Wheel(0.104 + 0.3 * serialNumber, 0.735, 0, 0, thirdColor, fourthColor);
        this.rightWheel = new Wheel(0.208 + 0.3 * serialNumber, 0.735, 0, 0, thirdColor, fourthColor);
        this.windowTrio = new WindowTrio(0.0563 + 0.3 * serialNumber, 0.57, 0.05, 0.0667, fifthColor);
        this.label = new Label(0.082 + 0.3 * serialNumber, 0.54, 0, 0, thirdColor);
        this.leftAutomaticCoupling = new AutomaticCoupling(0.005 + 0.3 * serialNumber, 0.666, 0.052, 0.022, sixthColor);
        this.rightAutomaticCoupling = new AutomaticCoupling(0.281 + 0.3 * serialNumber, 0.666, 0.052, 0.022, sixthColor);
    }

    @Override
    public void draw(Graphics2D g, int windowWidth, int windowHeight) {
        bodyRailwayCar.draw(g, windowWidth, windowHeight);
        leftWheel.draw(g, windowWidth, windowHeight);
        rightWheel.draw(g, windowWidth, windowHeight);
        windowTrio.draw(g, windowWidth, windowHeight);
        label.draw(g, windowWidth, windowHeight);
        leftAutomaticCoupling.draw(g, windowWidth, windowHeight);
        rightAutomaticCoupling.draw(g, windowWidth, windowHeight);
    }
}
