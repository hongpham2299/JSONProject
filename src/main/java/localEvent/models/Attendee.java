package localEvent.models;

public class Attendee {

    private String id;
    private String name;
    private String email;
    private String phone;
    private PaymentDetail paymentDetail;


    public Attendee(){}

    public Attendee(String id, String name, String email, String phone, PaymentDetail paymentDetail) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.paymentDetail = paymentDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PaymentDetail getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(PaymentDetail paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    @Override
    public String toString() {
        return  "  attendee \n" +
                "     id: " + id + "\n" +
                "     name: " + name + "\n" +
                "     email: " + email + "\n" +
                "     phone: " + phone + "\n" +
                "     paymentDetail: " + paymentDetail + "\n";
    }

    public String display(){
        return "    attendee \n" +
                "       id: " + id + "\n" +
                "       name: " + name + "\n" +
                "       email: " + email + "\n" +
                "       phone: " + phone + "\n" +
                "       paymentDetail \n" + paymentDetail;
    }
}
