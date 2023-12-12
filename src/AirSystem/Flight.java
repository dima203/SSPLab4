package AirSystem;

public class Flight {
    private final Brigade _brigade;
    private final Airport _startPoint;
    private Airport _endPoint;
    private final Airplane _airplane;
    private boolean _isDoing = false;
    private boolean _isCanceled = false;

    public Flight(Airplane airplane, Brigade brigade, Airport start, Airport end) {
        _brigade = brigade;
        _startPoint = start;
        _endPoint = end;
        _airplane = airplane;
    }

    public void SetEndPoint(Airport newPoint) {
        _endPoint = newPoint;
    }

    public void Start() {
        _isDoing = true;
    }

    public void Cancel() {
        _isCanceled = true;
    }

    public boolean IsDoing() {
        return _isDoing;
    }

    public boolean IsCanceled() {
        return _isCanceled;
    }

    @Override
    public String toString() {
        return _startPoint.toString() + " -> " + _endPoint.toString();
    }
}
