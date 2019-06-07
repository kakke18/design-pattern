package chapter22_Command;

import chapter22_Command.command.Command;
import chapter22_Command.command.MacroCommand;
import chapter22_Command.drawer.ColorCommand;
import chapter22_Command.drawer.DrawCanvas;
import chapter22_Command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter22Main extends JFrame implements ActionListener {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");
    /*--- kadai22-1 ---*/
    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");
    /*--- kadai22-2 ---*/
    private JButton undoButton = new JButton("undo");

    public Chapter22Main(String title) {
        super(title);

//        this.addWindowListener(this);
//        canvas.addMouseMotionListener(this);
//        clearButton.addActionListener(this);
        /*--- kadai22-3 ---*/
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });

        /*--- kadai22-1 ---*/
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        /*--- kadai22-2 ---*/
        undoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        /*--- kadai22-1 ---*/
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        /*--- kadai22-2 ---*/
        buttonBox.add(undoButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == clearButton) {
            history.clear();
            /*--- kadai22-1 ---*/
            canvas.init();
            /*-----------------*/
            canvas.repaint();
        } else if (actionEvent.getSource() == redButton) {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        } else if (actionEvent.getSource() == greenButton) {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        } else if (actionEvent.getSource() == blueButton) {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        } else if (actionEvent.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }

//    @Override
//    public void mouseMoved(MouseEvent mouseEvent) {}
//    @Override
//    public void mouseDragged(MouseEvent mouseEvent) {
//        Command cmd = new DrawCommand(canvas, mouseEvent.getPoint());
//        history.append(cmd);
//        cmd.execute();
//    }
//
//    @Override
//    public void windowClosing(WindowEvent windowEvent) {
//        System.exit(0);
//    }
//    @Override
//    public void windowActivated(WindowEvent windowEvent) {}
//    @Override
//    public void windowClosed(WindowEvent windowEvent) {}
//    @Override
//    public void windowDeactivated(WindowEvent windowEvent) {}
//    @Override
//    public void windowDeiconified(WindowEvent windowEvent) {}
//    @Override
//    public void windowIconified(WindowEvent windowEvent) {}
//    @Override
//    public void windowOpened(WindowEvent windowEvent) {}

    public static void main(String[] args) {
        new Chapter22Main("Command Pattern Sample");
    }
}
