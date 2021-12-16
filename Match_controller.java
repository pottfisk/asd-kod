import java.util.*;

public class Match_controller {
    Database_pool db_pool;

    private static Match_controller instance;
    public static Match_controller getInstance(){
	return instance;
    }
    public boolean remove(){
	return true;
    }
    public List<Match> view_matches(String uid){
	db_pool = Database_pool.getInstance();
	Database_handler db_handler = db_pool.get_DB_handler();
	return db_handler.get_matches(uid);
    }
    public boolean review(){
	return true;
    }
}
