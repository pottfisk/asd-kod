import java.awt.Image;
import java.util.*;
public class Chat_controller {
    Database_pool db_pool;
    private static Chat_controller instance;
    public static Chat_controller getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Chat_controller();
	}
    }
    public String display_message(){
	return "";
    }
    public boolean send_message(String msg){
	Message message = new Message(msg, 0, "This user", "Some other user");
	// Sending message here
	Database_handler db_handler = db_pool.get_DB_handler();
	db_handler.set_chat_data(message);
	return true;
    }

    public Date display_date(String uid){
	return new Date();
    }

    public List<Message> load_chat(int match_id){
	db_pool = Database_pool.getInstance();
	Database_handler db_handler = db_pool.get_DB_handler();
	List<Message> messages = db_handler.get_chat_data(match_id);
	db_pool.release_DB_handler();
	return messages;
    }
}
