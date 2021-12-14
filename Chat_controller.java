import java.awt.Image;
import java.util.*;
public class Chat_controller {
    private static Match_controller instance;
    public static Match_controller getInstance(){
	return instance;
    }
    public String display_message(){
	return "";
    }
    public boolean send_message(Message msg){
	return true;
    }

    public Date display_date(String uid){
	return new Date();
    }
    public boolean load_chat(int match_id){
	return true;
    }
}
