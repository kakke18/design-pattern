package chapter22_Command.drawer;

import chapter22_Command.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
//    private Color color = Color.red;
//    private int radius = 6;
    /*--- kadai22-1 ---*/
    private Color color;
    private int radius;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
        /*--- kadai22-1 ---*/
        init();
    }

    public void paint(Graphics g) {
        history.execute();
    }

    /*--- kadai22-1 ---*/
    @Override
    public void init() {
        color = Color.red;
        radius = 6;
        history.append(new ColorCommand(this, color));
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    /*--- kadai22-1 ---*/
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
