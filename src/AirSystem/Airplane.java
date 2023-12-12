package AirSystem;

public class Airplane {
    private final int _capacity;
    private boolean _isUsed = false;

    public Airplane(int capacity) {
        _capacity = capacity;
    }

    public void Reserve() {
        _isUsed = true;
    }

    public void Free() {
        _isUsed = false;
    }

    public boolean IsUsed() {
        return _isUsed;
    }
}
