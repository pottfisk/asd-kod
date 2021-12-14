class Creditcard implements Payment_method {
    public int card_number;
    public int exp_date;
    public int CVC;
    Creditcard(int number, int exp_date, int cvc){}
    public boolean pay(int amount) {
	return true;
    }
}
