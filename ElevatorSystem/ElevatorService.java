package populardesignProblems.ElevatorSystem;


public class ElevatorService {
    Floor currectFloor;


    ElevatorService(Floor floor)
    {
        currectFloor = floor;
    }

    public void makeRequest(Floor destinationFloor)
    {
        Request request = new Request(currectFloor,destinationFloor);
        ElevatorRequestHolder  requestHolder=ElevatorRequestHolder.getHolder();
        requestHolder.putRequest(request);
    }


}
