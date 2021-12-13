package jr.soft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RunningButton extends JButton {

    // max size of window needs to be specified
    int max_x = 0;
    int max_y = 0;
    int button_width = 150;
    int button_height = 100;

    public RunningButton(String title, int max_x, int max_y) throws HeadlessException {
        super(title);
        this.max_x = max_x - this.button_height;
        this.max_y = max_y - this.button_width;
        setBounds(100, 100, this.button_width, this.button_height);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                moveButton(e.getX());
            }
        });
    }

    private void moveButton(int current_mouse_x) {
        int x = (int) (Math.random() * ((this.max_x) + 1));
        int y = (int) (Math.random() * ((this.max_y) + 1));

        if (current_mouse_x < 130) {
            setLocation(x, y);
        }

    }
}
