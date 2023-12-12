package AirSystem;

import java.util.HashMap;
import java.util.Map;

public class AirSystem {
    private Administrator _administrator;
    private Map<Integer, Flight> _flights;
    private int _lastFlight = 0;

    public AirSystem(Administrator administrator) {
        _administrator = administrator;
        _flights = new HashMap<Integer, Flight>();
    }

    public int AddFlight(Flight flight) {
        _lastFlight++;
        _flights.put(_lastFlight, flight);
        return _lastFlight;
    }

    public void StartFlight(int flightNumber) {
        _flights.get(flightNumber).Start();
    }

    public void EndFlight(int flightNumber) {
        _flights.remove(flightNumber);
    }

    public void CancelFlight(int flightNumber) {
        _flights.get(flightNumber).Cancel();
    }

    public Brigade CreateBrigade(String firstPilot, String secondPilot, String navigator,
                              String radioOperator, String[] stewardesses) {
        return _administrator.CreateBrigade(firstPilot, secondPilot, navigator, radioOperator, stewardesses);
    }

    public void PrintInfo() {
        for (Map.Entry<Integer, Flight> entry : _flights.entrySet()) {
            String status = "waiting";
            if (entry.getValue().IsCanceled())
                status = "canceled";
            else if (entry.getValue().IsDoing())
                status = "doing";
            System.out.println(entry.getValue().toString() + "\t" + entry.getKey().toString() + "\t" + status);
        }
    }
}
