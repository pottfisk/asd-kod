import java.util.*;


public class Match {
    private String uid;
    private int match_id;
    private int match_date;
    private boolean shown;
    private boolean accepted;
    private List<Matcher> reviews; 

    public User_info get_user_info() {
	return new User_info("","",0,0,"","",new ArrayList(),0);
    }
    public boolean accept(){
	return true;
    }
    public boolean decline(){
	return true;
    }
    
    public Date create_date(User_info d1, User_info d2){
	return new Date();
    }
}
