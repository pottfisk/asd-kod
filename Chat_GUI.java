import java.awt.Image;
import java.util.*;
public class Chat_GUI {
    private List<String> messages;
    private static Match_GUI instance;
    public static Match_GUI getInstance(){
	return instance;
    }
    public boolean send_message(String msg){
	return true;
    }
    
    public boolean define_msg_text(String msg){
	return true;
    }
    
    public boolean select_image(Image img){
	return true;
    }

    public Date display_date(String uid){
	return new Date();
    }
}
