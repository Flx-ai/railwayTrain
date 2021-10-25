package vsu.cs.ru;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException {
        this.setSize(1600, 900);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.add(new DrawPanel());
    }
}
