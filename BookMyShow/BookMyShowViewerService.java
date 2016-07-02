package populardesignProblems.BookMyShow;

import java.util.List;

/**
 * Created by PPandey
 */
public interface BookMyShowViewerService {

    List<Show> getShows(Criteria criteria);

    InVoice bookTickets(ShowRequest viewRequest);

}
