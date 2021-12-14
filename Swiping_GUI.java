public class Swiping_GUI {
    private static Swiping_GUI instance;
    public static Swiping_GUI getInstance(){
	return instance;
    }
    public boolean accept(String uid, String match_id){
	return true;
    }
    
    public boolean decline(String uid, String match_id){
	return true;
    }

    public boolean view(){
	return true;
    }

    public boolean swipe(){
	return true;
    }
}
