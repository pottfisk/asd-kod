import java.util.*;
public class Database_handler {
    public List<User_info> get_candidates(Preferences preferences){
	return new ArrayList<User_info>();
    }

    public boolean set_profile(User_info user_info) {
    return true;
    }

    public boolean set_feedback(Match match) {
	return true;
    }

    public boolean set_account_info(Account acc) {
	return true;
    } 

    public boolean set_settings(String uid, String theme, String language, boolean notifications) {
	return true;
    }

    public boolean set_payment_info(String uid, Payment_method method) {
	return true;
    }

    public boolean set_matches(Match match) {
	return true;
    }

    public boolean set_dates(Date date) {
	return true;
    }

    public boolean set_chat_data(Match match,Message msg) {
	return true;
    }

    public boolean set_preferences(String uid, Preferences prefs){
	return true;
    }

    public List<Match> get_matches(String uid){
	return new ArrayList<Match>();
    }

    public List<Date> get_dates(String uid){
	return new ArrayList<Date>();
    }

    public List<String> get_settings(String uid){
	return new ArrayList<String>();
    }

    public Account get_account(String username){
	return new Account();
    }

    public boolean add_account(String username, String password){
	return true;
    } 

    public String get_payment_info(String uid){
	return "";
    }

    public List<Message> get_chat_data(Match match){
	return new ArrayList<Message>();
    }

    public Preferences get_preferences(String uid){
	return new Preferences(0,0,"");
    }
	
}
