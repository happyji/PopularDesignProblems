package populardesignProblems.ElevatorSystem;

public class Request {
    Floor currentFloor;
    Floor destinationFloor;

    Request(Floor from,Floor to)
    {
        currentFloor = from;
        destinationFloor = to;
    }
}
