package populardesignProblems.BookMyShow;

/**
 * Created by PPandey on 7/1/2016.
 */
public interface BookMyShowOrganizerService {

    boolean organizeShow(Show newShow);

    boolean updateShow(Show show);

    boolean csncelShow(Show show);


}
