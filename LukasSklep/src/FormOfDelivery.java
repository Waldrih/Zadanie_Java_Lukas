public enum FormOfDelivery {
    POST(4),
    COURIER(3),
    INPOST(2);

    int deliveryTimeInDays;

    FormOfDelivery(int deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }
}
