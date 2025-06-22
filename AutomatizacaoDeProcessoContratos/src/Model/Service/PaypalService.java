package Model.Service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(double amount) {
		return amount*0.02;
	}

	@Override
	public Double interest(double amount, int months) {
		// TODO Auto-generated method stub
		return amount*0.01*months;
	}

}
