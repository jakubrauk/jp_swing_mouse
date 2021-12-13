package jr.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.HashMap;

public class MainWindow extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow() throws HeadlessException {
        this("Swing mouse and keyboard app");
    }

    public MainWindow(String title) throws HeadlessException {
        super(title);
        buildFrame();
    }

    protected void buildFrame() {
        setBounds(0, 0, 600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Content Pane

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Buttons initialization

        RunningButton runningButton = new RunningButton("Catch me!", 600, 600);

        contentPane.add(runningButton);



    }
}


