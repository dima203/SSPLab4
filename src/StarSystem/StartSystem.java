package StarSystem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StartSystem {
    private Star _star;
    private final List<List<Planet>> _planets;
    private final List<Integer> _orbits;

    public StartSystem(Star star) {
        _star = star;
        _planets = new ArrayList<>();
        _orbits = new ArrayList<>();
    }

    public void AddOrbit(int height) {
        _orbits.add(height);
        _planets.add(new ArrayList<>());
    }

    public void AddPlanet(Planet planet, int orbit) {
        _planets.get(orbit).add(planet);
    }

    public void SetStar(Star star){
        _star = star;
    }

    public void Simulate() {
        for (int i = 0; i < _orbits.size(); i++) {
            for (Planet planet : _planets.get(i))
                planet.Simulate();
        }
    }

    public void Draw(Graphics graphics) {
        _star.Draw(graphics);
        for (int i = 0; i < _orbits.size(); i++) {
            for (Planet planet : _planets.get(i))
                planet.Draw(graphics, _orbits.get(i));
        }
    }
}
