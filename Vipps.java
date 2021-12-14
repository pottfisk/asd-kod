class Vipps implements Payment_method {
    public String phone_number;
    Vipps(String number){
	phone_number = number;
    }
    public boolean pay(int amount) {
	return true;
    }
}
