package jr.soft;

import java.awt.*;

public class OvalShape extends Shape {

    public OvalShape(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.RED);
        g2d.fillOval(x - 10, y - 10, 20, 20);
    }
}
