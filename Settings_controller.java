public class Settings_controller {
    private Payment_method p_method;
    private static Settings_controller instance;
    public static Settings_controller getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Settings_controller();
	}
    }
    public boolean delete_account(){
	return true;
	
    }
    public boolean update_language(String language){
	return true;
    }
    public boolean update_theme(String theme){
	return true;
    }
    public boolean update_notification(boolean prefs){
	return true;
    }
    public boolean update_subscription(boolean cancel){
	return true;
    }
}
