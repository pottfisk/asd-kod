

public class Matcher {
    private static Matcher instance;
    private Learner learner;
    public static Matcher getInstance(){
	return instance;
    }
    public Match suggest_match(){
	return new Match();
    }
    public boolean accept(String match_id){
	return true;
    }
    public boolean decline(String match_id){
	return true;
    }
}
