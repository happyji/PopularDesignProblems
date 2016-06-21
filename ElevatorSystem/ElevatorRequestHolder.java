package ElevatorSystem;

import java.util.HashSet;

public class ElevatorRequestHolder {
    static ElevatorRequestHolder singleton;
    static HashSet<Request> requests;

    private ElevatorRequestHolder()
    {
        requests = new HashSet<Request>();
    }

    public static ElevatorRequestHolder getHolder()
    {
        if(singleton == null)
            return new ElevatorRequestHolder();

        return singleton;
    }


    void putRequest(Request r)
    {
        requests.add(r);
    }

    void getNextRequest(Request r)
    {
        requests.add(r);
    }

}
