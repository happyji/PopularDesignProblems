import ElevatorSystem.ElevatorService;
import ElevatorSystem.ElevatorSystemManager;
import ElevatorSystem.Floor;

import java.util.List;

public class Application {

    public static void main(String[] args)
    {
        List<ElevatorService> services = ElevatorSystemManager.getServices();
        ElevatorService service =services.get(2);
         service.makeRequest(Floor.fLOOR1);
    }


}
