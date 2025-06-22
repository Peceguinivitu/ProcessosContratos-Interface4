package Model.Service;

public interface OnlinePaymentService {
	
	 Double paymentFee(double amount);
	 
	 Double interest(double amount, int months);

}
