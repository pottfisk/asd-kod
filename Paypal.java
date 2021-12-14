class Paypal implements Payment_method {
    public String email_address;
    Paypal(String email_address){}
    public boolean pay(int amount) {
	return true;
    }
}
