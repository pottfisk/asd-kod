import java.awt.Image;
import java.util.*;
public class Login_GUI {
    private static Login_GUI instance;
    public static Login_GUI getInstance(){
	return instance;
    }
    public boolean view(){
	return true;
    }
    public boolean login(){
	return true;
    }
    public boolean create_account(){
	Login_controller lc = Login_controller.getInstance();
	String username = "Bob";
	String password = "Alice"; //Input from user
	lc.create_account(username,password);
	int[] freetime = {1933331992, 200013013}; // Unix time in seconds since epoch
	lc.create_user_info("0","Robert",1123,23,"Uppsala","Happy guy",new ArrayList<Image>(),freetime);
	return true;
    }
}
