package StarSystem;

import java.awt.*;

public class Star {
    private final String _name;
    private final int _size;

    public Star(String name, int size) {
        _name = name;
        _size = size;
    }

    public void Draw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(400 - _size / 2, 400 - _size / 2, _size, _size);
    }
}
