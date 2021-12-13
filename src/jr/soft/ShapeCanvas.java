package jr.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ShapeCanvas extends JPanel{
    protected int shape_x, shape_y;
    protected ArrayList<Shape> shapesList = new ArrayList<>();

    public ShapeCanvas() {
        super();
        System.out.println("Canvas initialization");
        setFocusable(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                requestFocus();
                shape_x = e.getX();
                shape_y = e.getY();
//                System.out.println(shape_x);
//                System.out.println(shape_y);
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

                char key = e.getKeyChar();
                switch (key) {
                    case 'o':
//                        System.out.println("print oval");
                        addShape(new OvalShape(shape_x, shape_y), shape_x, shape_y);
                        break;
                    case 'r':
//                        System.out.println("print ractangular");
                        addShape(new RectangularShape(shape_x, shape_y), shape_x, shape_y);
                        break;
                }
            }
        });
    }

    public void addShape(Shape shape, int x, int y) {
        this.shapesList.add(shape);
//        System.out.println("Shape added");
        System.out.println(x);
        System.out.println(y);
        repaint();
    }

    public void removeShapes() {
        this.shapesList.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        for (Shape shape : this.shapesList) {
            shape.draw(g2d);
        }
    }
}
