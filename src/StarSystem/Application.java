package StarSystem;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    private final StartSystem _starSystem;
    private final JPanel _panel;

    public Application(StartSystem startSystem) {
        super("Star System");
        _starSystem = startSystem;
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        _panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);

                _starSystem.Simulate();
                _starSystem.Draw(graphics);
            }
        };

        _panel.setBackground(Color.BLACK);
        add(_panel);
        setVisible(true);
    }

    public void Run() {
        while (true)
            _panel.repaint();
    }
}
