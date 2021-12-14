public class Learner {
    private String uid;
    private int fav_age;
    private String fav_city;
    private String fav_gender;
    Learner(String uid, int fav_age, String fav_city, String fav_gender){}
    public Preferences get_learned_preferences(){
	return new Preferences(0,0,"");
    }
    public boolean learn_preferences(){
	return true;
    }
}
