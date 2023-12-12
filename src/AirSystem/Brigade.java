package AirSystem;

import java.sql.Array;
import java.util.List;

public class Brigade {
    private final int _number;
    private String _firstPilot;
    private String _secondPilot;
    private String _navigator;
    private String _radioOperator;
    private String[] _stewardesses;

    public Brigade(int number, String firstPilot, String secondPilot,
                   String navigator, String radioOperator, String[] stewardesses) {
        _number = number;
        _firstPilot = firstPilot;
        _secondPilot = secondPilot;
        _navigator = navigator;
        _radioOperator = radioOperator;
        _stewardesses = stewardesses;
    }

    @Override
    public String toString() {
        return "";
    }
}
