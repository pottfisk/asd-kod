import java.awt.Image;
import java.util.*;
public class Chat_GUI {
    Chat_controller cc;    
    private List<String> messages;
    private static Match_GUI instance;
    public static Match_GUI getInstance(){
	return instance;
    }
    public void click_on_chat(int match_id){
	cc = Chat_controller.getInstance();
	List<Message> messages = cc.load_chat(0);
	
    }
    public boolean send_message(String msg){
	return cc.send_message(msg);
       
    }

    public Date display_date(String uid){
	return new Date();
    }
}
