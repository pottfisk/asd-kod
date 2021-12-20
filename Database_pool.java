import java.util.*;
public class Database_pool {
    private static Database_pool instance;
    private int pool_amount = 0;
    private ArrayList<Database_handler> handlers = new ArrayList<Database_handler>();
    public static Database_pool getInstance(){
	if(instance != null){
	    return instance;
	} else {
	    return new Database_pool(10);
	}
    }
    Database_pool(int amount){
	pool_amount = amount;
	for (int i = 0; i <= amount; i++){
	    handlers.add(create_new_handler());
	}
    }
    public Database_handler get_DB_handler(){
	if(pool_amount == 0){
	    handlers.add(create_new_handler());
	}
	return handlers.remove(0);
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
