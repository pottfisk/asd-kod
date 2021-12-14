public class Swiping_controller {
    private static Swiping_controller instance;
    public static Swiping_controller getInstance(){
	return instance;
    }
    public boolean accept(String uid, String match_id){
	return true;
    }
    
    public boolean decline(String uid, String match_id){
	return true;
    }
    public Match suggest_match(String uid){
	return new Match();
    }

}
