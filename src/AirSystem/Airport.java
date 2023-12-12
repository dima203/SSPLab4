package AirSystem;

public class Airport {
    private final String _name;

    public Airport(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return _name;
    }
}
