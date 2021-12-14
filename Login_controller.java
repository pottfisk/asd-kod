public class Login_controller {
    private static Login_controller instance;
    public static Login_controller getInstance(){
	return instance;
    }
    public boolean verify_login(String username, String password){
	return true;
    }
    public boolean create_account(String username, String password){
	return true;
    }
}
