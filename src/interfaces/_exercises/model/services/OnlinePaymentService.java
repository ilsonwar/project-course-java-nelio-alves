package interfaces._exercises.model.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    abstract double interest(double amount, int months);
}
