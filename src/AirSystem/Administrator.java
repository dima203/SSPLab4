package AirSystem;

public class Administrator {
    private final String _name;
    private int _lastBrigade = 0;

    public Administrator(String name) {
        _name = name;
    }

    public Brigade CreateBrigade(String firstPilot, String secondPilot, String navigator,
                                 String radioOperator, String[] stewardesses) {
        _lastBrigade++;
        return new Brigade(_lastBrigade, firstPilot, secondPilot, navigator, radioOperator, stewardesses);
    }
}
