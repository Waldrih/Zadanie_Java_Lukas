import java.util.List;

public class Order {
    int id;
    String date;
    List<Product> productList;
    FormOfDelivery formOfDelivery;
    PaymentMethod paymentMethod;

    public Order(int id, String date, List<Product> productList, FormOfDelivery formOfDelivery, PaymentMethod paymentMethod) {
        this.id = id;
        this.date = date;
        this.productList = productList;
        this.formOfDelivery = formOfDelivery;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public FormOfDelivery getFormOfDelivery() {
        return formOfDelivery;
    }

    public void setFormOfDelivery(FormOfDelivery formOfDelivery) {
        this.formOfDelivery = formOfDelivery;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
