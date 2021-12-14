public class Sweden_payment_factory implements Payment_method_factory{
    public Payment_method create_payment_phone(String number){
	return new Swish(number);
    }
    public Payment_method create_payment_email(String email){
	return new Paypal(email);
    }
    public Payment_method create_payment_card(int number, int exp_date, int CVC){
	return new Creditcard(number,exp_date,CVC);
    };
       
}
