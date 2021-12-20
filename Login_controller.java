import java.awt.Image;
import java.util.*;
public class Login_controller {
    Account a;
    private static Login_controller instance;
    public static Login_controller getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Login_controller();
	}
    }
    public boolean verify_login(String username, String password){
	
	return true;
    }
    public boolean create_account(String username, String password){
	a = new Account("0",0,201301,username,password);
	return true;
    }
    public boolean create_user_info(String uid,
				    String name,
				    int phone_number,
				    int age,
				    String city,
				    String descriptive_text,
				    List<Image> images,
				    int[] freetime){
	a.create_user_info(uid,name,phone_number,age,city,descriptive_text,images,freetime);

	Database_pool db_pool = Database_pool.getInstance();
	Database_handler db_handler = db_pool.get_DB_handler();
	return db_handler.set_account_info(a);
	
    }
}
