public class Database_pool {
    private static Database_pool instance;
    public static Database_pool getInstance(){
	return instance;
    }
    public Database_handler get_dB_handler(){
	return new Database_handler();
    }
    public boolean set_max_amount(int size){
	return true;
    }
    public boolean release_DB_handler(){
	return true;
    }
    private Database_handler create_new_handler(){
	return new Database_handler();
    }
}
