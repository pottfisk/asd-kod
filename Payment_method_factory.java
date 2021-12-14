interface Payment_method_factory {
    public Payment_method create_payment_phone(String number);
    public Payment_method create_payment_email(String email);
    public Payment_method create_payment_card(int number, int exp_date, int CVC);
    
}
