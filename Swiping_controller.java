public class Swiping_controller {
    Matcher matcher;
    private static Swiping_controller instance;
    public static Swiping_controller getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Swiping_controller();
	}
    }
    public boolean accept(String uid, int match_id){
	return matcher.accept(uid,match_id);
    }
    
    public boolean decline(String uid, int match_id){
	return matcher.decline(uid,match_id);
    }    
    public Match suggest_match(String uid){
	matcher = Matcher.getInstance();
	return matcher.suggest_match(uid);
    }

}
