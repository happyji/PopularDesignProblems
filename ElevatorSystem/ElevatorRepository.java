package populardesignProblems.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorRepository
{
    public static ElevatorRepository singleton;
    static List<Elevator> elevators = new ArrayList<Elevator>();

    private ElevatorRepository()
    {
        elevators.add(new Elevator());
        elevators.add(new Elevator());
    }

    public static ElevatorRepository getElevatorRepository()
    {
         if (singleton == null)
             return new ElevatorRepository();

         return singleton;
    }

    List<Elevator> getElevators()
    {
        return elevators;
    }

}
