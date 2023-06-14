package localEvent.models;

public class PaymentDetail {

    private String paymentId;
    private String cardHolderName;
    private String cardType;
    private String cardNumber;
    private String expiration;
    private String cvv;

    public PaymentDetail(){}

    public PaymentDetail(String paymentId, String cardHolderName, String cardType, String cardNumber,
                         String expiration, String cvv) {
        this.paymentId = paymentId;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiration = expiration;
        this.cvv = cvv;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return  "\n" +
                "         paymentId: " + paymentId + "\n" +
                "         cardHolderName: " + cardHolderName + "\n" +
                "         cardType: " + cardType + "\n" +
                "         cardNumber: " + cardNumber + "\n" +
                "         expiration: " + expiration + "\n" +
                "         cvv: " + cvv;
    }

}
