import java.awt.Image;
import java.util.*;
public class Account {
    private String uid;
    private int price;
    private int registry_date;
    private String username;
    private String password;
    private User_info user_info;
    Account(){};
    Account(String uid, int price,int reg_date,String user, String pass){};
    public boolean create_user_info(String uid,
				    String name,
				    int phone_number,
				    int age,
				    String city,
				    String descriptive_text,
				    List<Image> images,
				    int[] freetime){
	return true;
    }
}
