package StarSystem;

import java.awt.*;

public class Planet {
    private final String _name;
    private final int _size;
    private double _position;
    private final double _rotationSpeed;

    public Planet(String name, int size, double startPosition, double rotationSpeed) {
        _name = name;
        _size = size;
        _position = startPosition;
        _rotationSpeed = rotationSpeed;
    }

    public void Simulate() {
        _position += _rotationSpeed;
    }

    public void Draw(Graphics graphics, int orbitHeight) {
        System.out.println((int)(400 + Math.cos(Math.toRadians(_position)) * orbitHeight - _size / 2.));
        graphics.setColor(Color.WHITE);
        graphics.fillOval(
                (int)(400 + Math.cos(Math.toRadians(_position)) * orbitHeight - _size / 2.),
                (int)(400 + Math.sin(Math.toRadians(_position)) * orbitHeight - _size / 2.),
                _size, _size);
    }
}
