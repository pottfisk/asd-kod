public class Swiping_GUI {
    Match match;
    String uid;
    Swiping_controller sc;
    private static Swiping_GUI instance;
    public static Swiping_GUI getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Swiping_GUI();
	}
    }
    public boolean accept(String uid, int match_id){
	return sc.accept(uid,match_id);
    }
    
    public boolean decline(String uid, int match_id){
	return sc.decline(uid,match_id);
    }

    public boolean view(){
	sc = Swiping_controller.getInstance();
	match = sc.suggest_match(uid);
	return true;
    }

    public boolean swipe(){
	boolean direction = true;
	if (direction){ //Swiping direction
	    accept(uid, match.get_match_id());
	}else {
	    decline(uid, match.get_match_id());
	}
	return true;
    }
}
