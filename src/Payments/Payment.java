package Payments;

public class Payment{
        private PaymentMethod paymentMethod;

        //Payment(upi)
        public Payment(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public boolean makePayment(double amount) {
            return paymentMethod.processPayment(amount);
        }
}

