class Swish implements Payment_method {
    public String phone_number;
    Swish(String number){
	phone_number = number;
    }
    public boolean pay(int amount) {
	return true;
    }
}
