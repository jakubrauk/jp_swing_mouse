package jr.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MainWindow window = new MainWindow();
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        });
    }

    public MainWindow() throws HeadlessException {
        this("Swing mouse and keyboard listener app");
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

        // Button initialization
        RunningButton runningButton = new RunningButton("Remove shapes", 600, 600);
        contentPane.add(runningButton);

        // Canvas initialization
        ShapeCanvas shapeCanvas = new ShapeCanvas();
        shapeCanvas.setBounds(5, 5, 590, 590);
        contentPane.add(shapeCanvas);
        shapeCanvas.setLayout(null);

        runningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                shapeCanvas.removeShapes();
            }
        });
    }
}


