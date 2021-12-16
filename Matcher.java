

public class Matcher {
    private static Matcher instance;
    private Learner learner;

    Database_handler db_handler;
    Match match;
    public static Matcher getInstance(){
	return instance;
    }
    public Match suggest_match(String uid){
	Database_pool db_pool = Database_pool.getInstance();
	db_handler = db_pool.get_DB_handler();
	Preferences prefs = db_handler.get_preferences(uid);
	match = new Match();
	return match;
    }
    public boolean accept(String uid, int match_id){
	Date date = match.accept();
	db_handler.set_matches(match);
	db_handler.set_dates(date);
	return true;
    }
    public boolean decline(String uid, int match_id){
	return match.decline();
    }
}
