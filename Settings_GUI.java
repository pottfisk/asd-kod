public class Settings_GUI {
    private boolean notifactions;
    private String app_theme;
    private String language;
    private static Settings_GUI instance;
    public static Settings_GUI getInstance(){
	return instance;
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
