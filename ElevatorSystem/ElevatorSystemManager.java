package populardesignProblems.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystemManager {
    public  static List<ElevatorService> services;

    ElevatorSystemManager()
    {

    }

    public static List<ElevatorService> getServices()
    {
        services = new ArrayList<ElevatorService>();
        for (Floor floor: Floor.values())
        {
            services.add(new ElevatorService(floor));
        }

        return services;
    }


}
