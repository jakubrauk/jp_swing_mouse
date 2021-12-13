package jr.soft;

import java.awt.*;

public class RectangularShape extends Shape {

    public RectangularShape(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.ORANGE);
        g2d.fillRect(x - 10, y - 10, 20, 20);
    }
}
